package com.olvind.mui.muiStyledEngine

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledEngineProviderStyledEngineProviderMod {
  
  @js.native
  trait StyledEngineProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.native
    
    var injectFirst: js.UndefOr[Boolean] = js.native
  }
  object StyledEngineProviderProps {
    
    @scala.inline
    def apply(): StyledEngineProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledEngineProviderProps]
    }
    
    @scala.inline
    implicit class StyledEngineProviderPropsMutableBuilder[Self <: StyledEngineProviderProps] (val x: Self) extends AnyVal {
      
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
      def setInjectFirst(value: Boolean): Self = StObject.set(x, "injectFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectFirstUndefined: Self = StObject.set(x, "injectFirst", js.undefined)
    }
  }
}
