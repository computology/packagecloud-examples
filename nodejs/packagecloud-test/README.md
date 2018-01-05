# packagecloud-test node.js package

All commands must be run from the project root.

Tested with NPM 5.6.0 and Node.js v9.2.1.

## To run

    $ npm run

## To package

    $ npm pack

## To publish

Configure your packagecloud repository as the NPM registry:

    $ npm config set registry https://packagecloud.io/test_user/test_repo/npm/

Run npm login and enter your packagecloud username, password and email:
    $ npm login
    Username: testy34

    Password: **********

    Email: (this IS public) testy34@packagecloud.io

Run npm publish:

    npm publish
