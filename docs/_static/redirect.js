/**
 * Global redirect script for all documentation pages.
 *
 * Resolution order:
 *   1. EXACT_URL_MAP  — pathname + hash → specific new URL  (handles anchor mismatches)
 *   2. PATH_MAP       — pathname only   → new base page URL  (drops hash)
 *   3. Fallback       — NEW_DOMAIN homepage
 */
(function () {
  var NEW_DOMAIN = 'https://developer.adobe.com/acrobat-sign';

  // ─── 1. Exact URL map (pathname + hash → full new URL) ────────────────────
  // Use this when the anchor ID differs between old and new sites.
  var EXACT_URL_MAP = {
    '/acrobat-sign/developer_guide/apiusage.html#api-throttling':
        'https://developer.adobe.com/acrobat-sign/docs/overview/developer_guide/apiusage#api-throttling',
    '/acrobat-sign/developer_guide/webhookapis.html#put-webhooks-webhookid-state':
        'https://developer.adobe.com/acrobat-sign/docs/overview/developer_guide/webhookapis#put-webhookswebhookidstate'
    // Add more exact mappings here as discovered
  };

  // ─── 2. Path map (pathname → new base URL, no hash) ───────────────────────
  // Use this for pages whose path structure changed but anchors are not critical.
  var PATH_MAP = {
    '/acrobat-sign/developer_guide/apiusage.html':
        'https://developer.adobe.com/acrobat-sign/docs/overview/developer_guide/apiusage',
    '/acrobat-sign/developer_guide/webhookapis.html':
        'https://developer.adobe.com/acrobat-sign/docs/overview/developer_guide/webhookapis',
    '/acrobat-sign/developer_guide/samples.html':
        'https://developer.adobe.com/acrobat-sign/docs/overview/developer_guide/samples'
    // Add more path mappings here
  };

  // ─── Resolve destination URL ───────────────────────────────────────────────
  var currentPath = window.location.pathname;
  var currentHash = window.location.hash; // e.g. "#api-throttling"
  var exactKey = currentPath + currentHash;

  var newUrl;
  if (EXACT_URL_MAP[exactKey]) {
    // Step 1: exact match on path + hash
    newUrl = EXACT_URL_MAP[exactKey];
  } else if (PATH_MAP[currentPath]) {
    // Step 2: path match only — drops the hash since anchor mapping is unknown
    newUrl = PATH_MAP[currentPath];
  } else {
    // Step 3: fallback to homepage
    newUrl = NEW_DOMAIN;
  }

  // ─── Banner ────────────────────────────────────────────────────────────────
  var timeToRedirect = 10;
  var banner = document.createElement('div');
  banner.id = 'migration-notice';
  banner.style.cssText = 'position: fixed; top: 0; left: 0; right: 0; background-color: #ff9800; color: white; padding: 20px; text-align: center; z-index: 9999; font-size: 18px; font-weight: bold;';
  banner.innerHTML = '⚠️ This page has been migrated to Adobe Developer Platform. You will be redirected in <span id="countdown">'
      + timeToRedirect + '</span> seconds...';
  document.body.insertBefore(banner, document.body.firstChild);

  // ─── Countdown ─────────────────────────────────────────────────────────────
  var secondsLeft = timeToRedirect;
  var countdownElement = document.getElementById('countdown');

  var countdownInterval = setInterval(function () {
    secondsLeft--;
    if (countdownElement) {
      countdownElement.textContent = secondsLeft;
    }
    if (secondsLeft <= 0) {
      clearInterval(countdownInterval);
    }
  }, 1000);

  // ─── Redirect ──────────────────────────────────────────────────────────────
  setTimeout(function () {
    window.location.replace(newUrl);
  }, timeToRedirect * 1000);
})();
