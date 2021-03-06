[![GitHub release](https://img.shields.io/github/release/sismics/play-cors.svg?style=flat-square)](https://github.com/sismics/play-cors/releases/latest)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# play-cors plugin

This plugin adds [CORS](http://en.wikipedia.org/wiki/Cross-origin_resource_sharing) support to Play! Framework 1 applications.

# Features

* Appends the required CORS headers to every HTTP request.
* Provides a pre-flight OPTIONS response for all requests to the application.

# How to use

####  Add the dependency to your `dependencies.yml` file

```
require:
    - cors -> cors 1.1.0

repositories:
    - sismicsNexusRaw:
        type: http
        artifact: "https://nexus.sismics.com/repository/sismics/[module]-[revision].zip"
        contains:
            - cors -> *

```
####  Run the `play deps` command
####  Add the routes to your `routes` file

```
# CORS routes
*       /               module:cors
```

# License

This software is released under the terms of the Apache License, Version 2.0. See `LICENSE` for more
information or see <https://opensource.org/licenses/Apache-2.0>.
