var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');
var Proxy = require('hessian-proxy').Proxy;
var session = require('express-session');

var routes = require('./routes/index');
var users = require('./routes/users');
var login = require('./routes/login');

var app = express();

// session 
app.use(session({  
  resave:false,//添加这行  
  saveUninitialized: true,//添加这行   
  secret: 'secret',//settings.cookieSecret,  
  //key: settings.db,//cookie name  
  //cookie: {maxAge: 1000 * 60 * 60 * 24 * 30},//30 days  
  cookie:{maxAge:1000*60*30}//,
 // store: new MongoStore({  
 //   db: settings.db,  
 //   host: settings.host,  
 //   port: settings.port  
//  })  
})); 

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', routes);
app.use('/users', users);
app.use('/login',login);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
  app.use(function(err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
      message: err.message,
      error: err
    });
  });
}

// production error handler
// no stacktraces leaked to user
app.use(function(err, req, res, next) {
  res.status(err.status || 500);
  res.render('error', {
    message: err.message,
    error: {}
  });
});
var proxy = new Proxy('http://127.0.0.1:8080/node_dubbo_server/provider/com.yuanxin.paas.ssb.TestService', '', '', proxy);

module.exports = app;
