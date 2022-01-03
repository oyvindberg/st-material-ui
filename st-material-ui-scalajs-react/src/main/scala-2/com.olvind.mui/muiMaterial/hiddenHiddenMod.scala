package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.css
import com.olvind.mui.muiMaterial.muiMaterialStrings.js_
import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoint
import com.olvind.mui.react.mod.JSXElementConstructor
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenHiddenMod extends Shortcut {
  
  /**
    * Responsively hides children based on the selected implementation.
    *
    * Demos:
    *
    * - [Hidden](https://mui.com/components/hidden/)
    *
    * API:
    *
    * - [Hidden API](https://mui.com/api/hidden/)
    */
  @JSImport("@mui/material/Hidden/Hidden", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[HiddenProps] = js.native
  
  @js.native
  trait HiddenProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[Node] = js.native
    
    /**
      * Specify which implementation to use.  'js' is the default, 'css' works better for
      * server-side rendering.
      * @default 'js'
      */
    var implementation: js.UndefOr[js_ | css] = js.native
    
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
    var initialWidth: js.UndefOr[Breakpoint] = js.native
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var lgDown: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var lgUp: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var mdDown: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var mdUp: js.UndefOr[Boolean] = js.native
    
    /**
      * Hide the given breakpoint(s).
      */
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var smDown: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var smUp: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var xlDown: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var xlUp: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and down are hidden.
      * @default false
      */
    var xsDown: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, screens this size and up are hidden.
      * @default false
      */
    var xsUp: js.UndefOr[Boolean] = js.native
  }
  object HiddenProps {
    
    @scala.inline
    def apply(): HiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenProps]
    }
    
    @scala.inline
    implicit class HiddenPropsMutableBuilder[Self <: HiddenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementation(value: js_ | css): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setLgDown(value: Boolean): Self = StObject.set(x, "lgDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgDownUndefined: Self = StObject.set(x, "lgDown", js.undefined)
      
      @scala.inline
      def setLgUp(value: Boolean): Self = StObject.set(x, "lgUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUpUndefined: Self = StObject.set(x, "lgUp", js.undefined)
      
      @scala.inline
      def setMdDown(value: Boolean): Self = StObject.set(x, "mdDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdDownUndefined: Self = StObject.set(x, "mdDown", js.undefined)
      
      @scala.inline
      def setMdUp(value: Boolean): Self = StObject.set(x, "mdUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUpUndefined: Self = StObject.set(x, "mdUp", js.undefined)
      
      @scala.inline
      def setOnly(value: Breakpoint | js.Array[Breakpoint]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: Breakpoint*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setSmDown(value: Boolean): Self = StObject.set(x, "smDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmDownUndefined: Self = StObject.set(x, "smDown", js.undefined)
      
      @scala.inline
      def setSmUp(value: Boolean): Self = StObject.set(x, "smUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUpUndefined: Self = StObject.set(x, "smUp", js.undefined)
      
      @scala.inline
      def setXlDown(value: Boolean): Self = StObject.set(x, "xlDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlDownUndefined: Self = StObject.set(x, "xlDown", js.undefined)
      
      @scala.inline
      def setXlUp(value: Boolean): Self = StObject.set(x, "xlUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUpUndefined: Self = StObject.set(x, "xlUp", js.undefined)
      
      @scala.inline
      def setXsDown(value: Boolean): Self = StObject.set(x, "xsDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsDownUndefined: Self = StObject.set(x, "xsDown", js.undefined)
      
      @scala.inline
      def setXsUp(value: Boolean): Self = StObject.set(x, "xsUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUpUndefined: Self = StObject.set(x, "xsUp", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenHiddenMod.foo` */
  override def _to: JSXElementConstructor[HiddenProps] = default
}
