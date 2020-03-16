# SpringMVC
This repository includes basis of Spring MVC

# Cache and Update Static Assets
- Using a cache for serving the static assets makes the page load really fast, but it has an important caveat. When you update the file, the client will not get the most recent version of the file since it does not check with the server if the file is up-to-date and just serves the file from the browser cache.

- Serve the file under a URL which has a version in it. For example, foo.js should be served under /js/foo-423523442332423423.js
- Update links to the file with the new URL
- Update version part of the URL whenever the file is updated. For example, when foo.js is updated, it should now be served under /js/foo-423523442332423423.js.
- The client will request the file from the server when it's updated because the page will have a link to a different URL, so the browser will not use its cache. If a file is not updated, its version (hence its URL) will not change and the client will keep using the cache for that file.
- Normally, we would need to do all of these manually, but Spring supports these out of the box, including calculating the hash for each file and appending them to the URLs. Let's see how we can configure our Spring application to do all of this for us.
