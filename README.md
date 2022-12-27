# st-material-ui - Material UI 5 for Scala 3 (Slinky and Scalajs-React)


Material UI is a fantastic UI toolkit, and Scala.js is a fantastic frontend language - 
Finally we can combine the newest versions of the two!


*There are bunch of `Any`s shown in the video, but that is due to IntelliJ's not-perfect Scala 3 support*

https://user-images.githubusercontent.com/247937/208323992-fa7110b0-6a1f-4ea9-adf9-b61c0e9c39cc.mp4



[demo repo with working code to get started](https://github.com/oyvindberg/st-material-ui-demo)

## Joy UI

There are now also bindings for [@mui/joy](https://mui.com/joy-ui/getting-started/overview/). These are not tested yet, but very likely work.

## Installation

Note that this library is *only* available for Scala 3.2.1+. 

It will probably not be back-ported to Scala 2.13 because the encoding relies on `@targetName`, which doesn't exist.

```scala
libraryDependencies ++= List(
    // scalajs-react
    "com.olvind.st-material-ui" %%% "st-material-ui-scalajs-react" % "<version>",
    // if you want icons (scalajs-react) Note that this is 70 megabytes compressed jar file
    "com.olvind.st-material-ui" %%% "st-material-ui-icons-scalajs-react" % "<version>", 
    // if you want joy ui 
    "com.olvind.st-material-ui" %%% "st-joy-scalajs-react" % "<version>", 
    // slinky
    "com.olvind.st-material-ui" %%% "st-material-ui-slinky" % "<version>",
    // if you want icons (slinky). Note that this is 70 megabytes compressed jar file
    "com.olvind.st-material-ui" %%% "st-material-ui-icons-slinky" % "<version>", 
    // if you want joy ui 
    "com.olvind.st-material-ui" %%% "st-joy-slinky" % "<version>", 
)
```

### Getting started (Scalajs-react)

```scala
import com.olvind.mui.muiMaterial.components as mui
import japgolly.scalajs.react.React.Fragment
import japgolly.scalajs.react.{Callback, ScalaFnComponent}
import japgolly.scalajs.react.vdom.Implicits.*
import org.scalajs.dom

val MyComponent = ScalaFnComponent[Unit] { case () =>
  Fragment(
    mui.Typography.variant("h4")("Basic button"),
    mui.Button.normal.variant("text")("Text"),
  )
}
@main
def main: Unit =
  MyComponent().renderIntoDOM(dom.document.getElementById("app"))

```

### Getting started (Slinky)
The Slinky version is completely untested so far, but should work because all the machinery is the same.

If you want to contribute to this repo, writing this section and cloning the scalajs-react demos would be particularly welcome.


## Features

### Bundles a pleasant version of the React DOM.

- Scalajs-react relies on an encoding of the React DOM derived from scalatags, where you compose smaller things into bigger things. This comes with some complexity as to general usage, legal combinations of tags/attributes, poor help from IDE, bad compile errors and so on.
- Slinky uses something similar, with an heavy implicit machinery to decide which tags and attributes go together, which makes callbacks especially hard to use.

ST, on the other hand, has an encoding which uses the same builder pattern used for all other react components, which is method driven. All explicit, easy to navigate in IDE, all up to date with all the weird details, courtesy of Typescript.

```scala
import com.olvind.mui.react.components as react

react.div.onClick(_ => ...do something)("Contents") 

react.button
  .unsafeSpread(ctrl.getToggleButtonProps())
  .`aria-label`("toggle menu")(
    "toggle menu"
  )
```

### Styled components

`st-material-ui` provides some hand written syntax for creating styled components. It is a fabulous way of working with styling, all in the Javascript. The underlying Javascript library is `@emotion/react`.

All MUI and DOM react components have the `styled` method to start building a styled component. 

```scala
val Item = div.styled
  // if it's all static you can supply CSS to `apply`
  .apply(
    new CSSObject {
      textAlign = "center"
    }
  )  
  // if you want to do things dynamically based on theme and props, use `fn`
  .fn { (theme, props) =>
    new CSSObject {
      padding = theme.spacing(5)
      textAlign = "center"
      color = theme.palette_BaseTheme.text.secondary
    }.combineWith(theme.typography_BaseTheme.body2)
  }
  .opts(/* ... detailed configuration can be done here */)
  // store the result in a `val` before usage
  .build()
  
// usage
Item(
    mui.Typography.variant("h2")("Autocomplete"),
    AutoComplete.Asynchronous()
)  
```

You can also specify styling in props with the `styles` prop for many components
```scala
mui.Typography.variant("h1")("Material-UI 5 for Scala 3").style(new CSSProperties {
  backgroundColor = "red"
})
```    

### Three-shaking enabled as default.

As opposed to the Typescript version, here the nicest syntax has the best runtime properties. See [Minimizing bundle size](https://mui.com/material-ui/guides/minimizing-bundle-size/) for all the work you don't have to do.



## The culmination of years of *on-and-off* effort.

In the last few years, I have been working on the [ScalablyTyped](https://scalablytyped.org) project for translating Typescript to Scala.js. One of the primary goals was to enable a reliably up-to-date and usable facade for Material UI.

For the longest time though, it has been stuck with supporting Material UI up to 3.9.3, which is more than dated now.

### Challenge 
The reason it was stuck there is that it pushes Typescript to it's limits, and it uses some extraordinary powerful techniques.
Way too complex stuff for a readme file, but the design space is explored briefly [in this blog post](https://blog.andrewbran.ch/polymorphic-react-components/).

The main complication is that you can specify `component` to override the underlying component (typically `a`, `button`, `div`, or `MyComponent`), and 
by doing that you're doing a deep, type-level rewrite of the allowed props.

### Solution

Ignore the `component` part. With this library you use the default underlying component.
You can certainly freestyle and go `Box.set("component", "a")` and it'll work, but you will lose some type-safety in the callbacks.

So that brings us to version *5.11.0*. It works!

## State

Mostly untested, but should work. The codegen used for this has been tested extensively elsewhere.

That said, there are certainly imperfections in the code. Sometimes you'll just have to cast. There are entire huge type-level features from Typescript which are inexpressible in Scala. *Material UI* uses all of them.




