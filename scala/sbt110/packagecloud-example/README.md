# packagecloud-example for sbt 1..x

Deploys an example project to [capotej/scala-test](https://packagecloud.io/capotej/scala-test)

Tested with sbt 1.1.5 and Java 8 (1.8.0_152)


## Credentials setup
You'll need to have your packagecloud API token set up in your `~/.ivy2/.credentials` file in the following format:

```
realm=packagecloud
host=packagecloud.io
user=
password=101010101010101010101010
```

Note: that `user` should be blank.

## To deploy

    $ sbt aether-deploy

## To build

    $ sbt compile
