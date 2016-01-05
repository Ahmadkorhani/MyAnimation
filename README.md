# MyAnimation
This project can do animations for any view in the activity using this libraries
```
https://github.com/daimajia/AndroidViewAnimations
```

The syntax for this library is very easy:

```
YoYo.with(Techniques.Bounce)
    .duration(700)
    .playOn(findViewById(R.id.usernameField));
```    
Including it is simple, though it does require two other projects as well:

```
dependencies {
  compile 'com.nineoldandroids:library:2.4.0'
  compile 'com.daimajia.easing:library:1.0.0@aar'
  compile 'com.daimajia.androidanimations:library:1.0.8@aar'
}
```
