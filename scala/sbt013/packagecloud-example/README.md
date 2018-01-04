# packagecloud-example for sbt 0.13.x

Deploys an example project to [capotej/scala-test](https://packagecloud.io/capotej/scala-test)

Tested with sbt 0.13.16.


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
