package com.olvind.mui.muiBase

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrNoSsrMod {
  
  trait NoSsrProps extends StObject {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If `true`, the component will not only prevent server-side rendering.
      * It will also defer the rendering of the children into a different screen frame.
      * @default false
      */
    var defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fallback content to display.
      * @default null
      */
    var fallback: js.UndefOr[Node] = js.undefined
  }
  object NoSsrProps {
    
    inline def apply(): NoSsrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoSsrProps]
    }
    
    extension [Self <: NoSsrProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
