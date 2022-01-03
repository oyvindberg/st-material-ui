package com.olvind.mui.emotionReact

import com.olvind.mui.emotionReact.emotionReactMod.Theme
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themingMod {
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
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
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
