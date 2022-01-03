package com.olvind.mui.muiStyledEngine

import com.olvind.mui.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesGlobalStylesMod {
  
  trait GlobalStylesProps[Theme] extends StObject {
    
    var defaultTheme: js.UndefOr[js.Object] = js.undefined
    
    var styles: Interpolation[Theme]
  }
  object GlobalStylesProps {
    
    inline def apply[Theme](): GlobalStylesProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalStylesProps[Theme]]
    }
    
    extension [Self <: GlobalStylesProps[?], Theme](x: Self & GlobalStylesProps[Theme]) {
      
      inline def setDefaultTheme(value: js.Object): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
      
      inline def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesNull: Self = StObject.set(x, "styles", null)
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
