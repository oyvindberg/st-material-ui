package com.olvind.mui.emotionReact

import com.olvind.mui.emotionReact.emotionReactMod.Theme
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

object themingMod {
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.native
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme]) = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
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
      def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
