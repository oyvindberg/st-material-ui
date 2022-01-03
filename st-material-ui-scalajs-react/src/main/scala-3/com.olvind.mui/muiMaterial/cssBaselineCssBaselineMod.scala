package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stylesMod.StyledComponentProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineCssBaselineMod {
  
  @JSImport("@mui/material/CssBaseline/CssBaseline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CssBaselineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CssBaselineProps
    extends StObject
       with StyledComponentProps[scala.Nothing] {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Enable `color-scheme` CSS property to use `theme.palette.mode`.
      * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
      * For browser support, check out https://caniuse.com/?search=color-scheme
      * @default false
      */
    var enableColorScheme: js.UndefOr[Boolean] = js.undefined
  }
  object CssBaselineProps {
    
    inline def apply(): CssBaselineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssBaselineProps]
    }
    
    extension [Self <: CssBaselineProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
      
      inline def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
    }
  }
}
