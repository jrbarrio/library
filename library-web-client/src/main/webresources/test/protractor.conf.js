exports.config = {
  //seleniumAddress: 'http://localhost:4444/wd/hub',
  seleniumServerJar: '../node_modules/protractor/selenium/selenium-server-standalone-2.48.2.jar',
  chromeDriver: '../node_modules/protractor/selenium/chromedriver',
  specs: ['**/e2e/*.js'],
  baseUrl: 'http://localhost:9001' //default test port with Yeoman
}
