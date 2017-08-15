# maven-multi-module-example

All commands must be run from the project root.

Requires Maven 3.3.x or greater.

## To deploy a specific module

    $ mvn deploy -pl 'beta-module'

## To deploy all modules

    $ mvn deploy

## To deploy all modules, except `beta-module`
    $ mvn deploy -pl '!beta-module'
