package com.olvind.mui.muiStyledEngine

import com.olvind.mui.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesGlobalStylesMod {
  
  @js.native
  trait GlobalStylesProps[Theme] extends StObject {
    
    var defaultTheme: js.UndefOr[js.Object] = js.native
    
    var styles: Interpolation[Theme] = js.native
  }
  object GlobalStylesProps {
    
    @scala.inline
    def apply[Theme](): GlobalStylesProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalStylesProps[Theme]]
    }
    
    @scala.inline
    implicit class GlobalStylesPropsMutableBuilder[Self <: GlobalStylesProps[_], Theme] (val x: Self with GlobalStylesProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setDefaultTheme(value: js.Object): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
      
      @scala.inline
      def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
