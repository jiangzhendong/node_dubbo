var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Home Cinema' });
  res.render('login', { title: 'Home cinema' });
});

module.exports = router;
