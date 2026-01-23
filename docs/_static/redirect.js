/**
 * Global redirect script for all documentation pages
 * Redirects to the new domain while preserving the path
 */
(function() {
  // Create and inject the migration notice banner
  var banner = document.createElement('div');
  banner.id = 'migration-notice';
  banner.style.cssText = 'position: fixed; top: 0; left: 0; right: 0; background-color: #ff9800; color: white; padding: 20px; text-align: center; z-index: 9999; font-size: 18px; font-weight: bold;';
  banner.innerHTML = '⚠️ This page has been migrated to Adobe Developer Platform. You will be redirected in <span id="countdown">10</span> seconds...';
  document.body.insertBefore(banner, document.body.firstChild);

  // Configure your new domain
  var NEW_DOMAIN = 'https://developer.adobe.com/acrobat-sign';

  // Get current path
  var currentPath = window.location.pathname;
  var pathMatch = currentPath.match(/\/acrobat-sign\/(.*)$/);
  var relativePath = pathMatch ? pathMatch[1] : currentPath.replace(/^\//, '');

  // Construct new URL
  var newUrl = NEW_DOMAIN;

  // Countdown logic
  var secondsLeft = 10;
  var countdownElement = document.getElementById('countdown');

  var countdownInterval = setInterval(function() {
    secondsLeft--;
    if (countdownElement) {
      countdownElement.textContent = secondsLeft;
    }
    if (secondsLeft <= 0) {
      clearInterval(countdownInterval);
    }
  }, 1000);

  // Redirect after 10 seconds
  setTimeout(function () {
    window.location.replace(newUrl);
  }, 10000);
})();


