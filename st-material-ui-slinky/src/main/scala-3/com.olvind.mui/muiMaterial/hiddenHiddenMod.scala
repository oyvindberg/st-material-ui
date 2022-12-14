package com.olvind.mui.muiMaterial

import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoint
import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenHiddenMod extends Shortcut {
  
  /**
    * Responsively hides children based on the selected implementation.
    *
    * Demos:
    *
    * - [Hidden](https://mui.com/material-ui/react-hidden/)
    *
    * API:
    *
    * - [Hidden API](https://mui.com/material-ui/api/hidden/)
    */
  @JSImport("@mui/material/Hidden/Hidden", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[HiddenProps] = js.native
  
  trait HiddenProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Specify which implementation to use.  'js' is the default, 'css' works better for
      * server-side rendering.
      * @default 'js'
      */
    var implementation: js.UndefOr["js" | "css"] = js.undefined
    
    /**
      * You can use this prop when choosing the `js` implementation with server-side rendering.
      *
      * As `window.innerWidth` is unavailable on the server,
      * we default to rendering an empty component during the first mount.
      * You might want to use a heuristic to approximate
      * the screen width of the client browser screen width.
      *
      * For instance, you could be using the user-agent or the client-hints.
      * https://caniuse.com/#search=client%20hint
      */
    var initialWidth: js.UndefOr[Breakpoint] = js.undefined
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var lgDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var lgUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var mdDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var mdUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide the given breakpoint(s).
      */
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.undefined
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var smDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var smUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var xlDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var xlUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var xsDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var xsUp: js.UndefOr[Boolean] = js.undefined
  }
  object HiddenProps {
    
    inline def apply(): HiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenProps]
    }
    
    extension [Self <: HiddenProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setImplementation(value: "js" | "css"): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      inline def setLgDown(value: Boolean): Self = StObject.set(x, "lgDown", value.asInstanceOf[js.Any])
      
      inline def setLgDownUndefined: Self = StObject.set(x, "lgDown", js.undefined)
      
      inline def setLgUp(value: Boolean): Self = StObject.set(x, "lgUp", value.asInstanceOf[js.Any])
      
      inline def setLgUpUndefined: Self = StObject.set(x, "lgUp", js.undefined)
      
      inline def setMdDown(value: Boolean): Self = StObject.set(x, "mdDown", value.asInstanceOf[js.Any])
      
      inline def setMdDownUndefined: Self = StObject.set(x, "mdDown", js.undefined)
      
      inline def setMdUp(value: Boolean): Self = StObject.set(x, "mdUp", value.asInstanceOf[js.Any])
      
      inline def setMdUpUndefined: Self = StObject.set(x, "mdUp", js.undefined)
      
      inline def setOnly(value: Breakpoint | js.Array[Breakpoint]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: Breakpoint*): Self = StObject.set(x, "only", js.Array(value*))
      
      inline def setSmDown(value: Boolean): Self = StObject.set(x, "smDown", value.asInstanceOf[js.Any])
      
      inline def setSmDownUndefined: Self = StObject.set(x, "smDown", js.undefined)
      
      inline def setSmUp(value: Boolean): Self = StObject.set(x, "smUp", value.asInstanceOf[js.Any])
      
      inline def setSmUpUndefined: Self = StObject.set(x, "smUp", js.undefined)
      
      inline def setXlDown(value: Boolean): Self = StObject.set(x, "xlDown", value.asInstanceOf[js.Any])
      
      inline def setXlDownUndefined: Self = StObject.set(x, "xlDown", js.undefined)
      
      inline def setXlUp(value: Boolean): Self = StObject.set(x, "xlUp", value.asInstanceOf[js.Any])
      
      inline def setXlUpUndefined: Self = StObject.set(x, "xlUp", js.undefined)
      
      inline def setXsDown(value: Boolean): Self = StObject.set(x, "xsDown", value.asInstanceOf[js.Any])
      
      inline def setXsDownUndefined: Self = StObject.set(x, "xsDown", js.undefined)
      
      inline def setXsUp(value: Boolean): Self = StObject.set(x, "xsUp", value.asInstanceOf[js.Any])
      
      inline def setXsUpUndefined: Self = StObject.set(x, "xsUp", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenHiddenMod.foo` */
  override def _to: JSXElementConstructor[HiddenProps] = default
}
