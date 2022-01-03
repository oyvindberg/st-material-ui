package com.olvind.mui.muiStyledEngine

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledEngineProviderStyledEngineProviderMod {
  
  trait StyledEngineProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var injectFirst: js.UndefOr[Boolean] = js.undefined
  }
  object StyledEngineProviderProps {
    
    inline def apply(): StyledEngineProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledEngineProviderProps]
    }
    
    extension [Self <: StyledEngineProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInjectFirst(value: Boolean): Self = StObject.set(x, "injectFirst", value.asInstanceOf[js.Any])
      
      inline def setInjectFirstUndefined: Self = StObject.set(x, "injectFirst", js.undefined)
    }
  }
}
