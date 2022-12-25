package com.olvind.mui.muiJoy

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesTypographyMod {
  
  type ExtendedTypographySystem = OverridableStringUnion[
    "display1" | "display2" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "body1" | "body2" | "body3" | "body4" | "body5", 
    TypographySystemOverrides
  ]
  
  trait FontFamily extends StObject {
    
    var body: String
    
    var code: String
    
    var display: String
    
    var fallback: String
  }
  object FontFamily {
    
    inline def apply(body: String, code: String, display: String, fallback: String): FontFamily = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFamily]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontSize extends StObject {
    
    var lg: String
    
    var md: String
    
    var sm: String
    
    var xl: String
    
    var xl2: String
    
    var xl3: String
    
    var xl4: String
    
    var xl5: String
    
    var xl6: String
    
    var xl7: String
    
    var xs: String
    
    var xs2: String
    
    var xs3: String
  }
  object FontSize {
    
    inline def apply(
      lg: String,
      md: String,
      sm: String,
      xl: String,
      xl2: String,
      xl3: String,
      xl4: String,
      xl5: String,
      xl6: String,
      xl7: String,
      xs: String,
      xs2: String,
      xs3: String
    ): FontSize = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xl2 = xl2.asInstanceOf[js.Any], xl3 = xl3.asInstanceOf[js.Any], xl4 = xl4.asInstanceOf[js.Any], xl5 = xl5.asInstanceOf[js.Any], xl6 = xl6.asInstanceOf[js.Any], xl7 = xl7.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xs2 = xs2.asInstanceOf[js.Any], xs3 = xs3.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXl2(value: String): Self = StObject.set(x, "xl2", value.asInstanceOf[js.Any])
      
      inline def setXl3(value: String): Self = StObject.set(x, "xl3", value.asInstanceOf[js.Any])
      
      inline def setXl4(value: String): Self = StObject.set(x, "xl4", value.asInstanceOf[js.Any])
      
      inline def setXl5(value: String): Self = StObject.set(x, "xl5", value.asInstanceOf[js.Any])
      
      inline def setXl6(value: String): Self = StObject.set(x, "xl6", value.asInstanceOf[js.Any])
      
      inline def setXl7(value: String): Self = StObject.set(x, "xl7", value.asInstanceOf[js.Any])
      
      inline def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXs2(value: String): Self = StObject.set(x, "xs2", value.asInstanceOf[js.Any])
      
      inline def setXs3(value: String): Self = StObject.set(x, "xs3", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontWeight extends StObject {
    
    var lg: String | Double
    
    var md: String | Double
    
    var sm: String | Double
    
    var xl: String | Double
    
    var xl2: String | Double
    
    var xl3: String | Double
    
    var xs: String | Double
  }
  object FontWeight {
    
    inline def apply(
      lg: String | Double,
      md: String | Double,
      sm: String | Double,
      xl: String | Double,
      xl2: String | Double,
      xl3: String | Double,
      xs: String | Double
    ): FontWeight = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xl2 = xl2.asInstanceOf[js.Any], xl3 = xl3.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontWeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String | Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String | Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String | Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: String | Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXl2(value: String | Double): Self = StObject.set(x, "xl2", value.asInstanceOf[js.Any])
      
      inline def setXl3(value: String | Double): Self = StObject.set(x, "xl3", value.asInstanceOf[js.Any])
      
      inline def setXs(value: String | Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  trait LetterSpacing extends StObject {
    
    var lg: String
    
    var md: String
    
    var sm: String
  }
  object LetterSpacing {
    
    inline def apply(lg: String, md: String, sm: String): LetterSpacing = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any])
      __obj.asInstanceOf[LetterSpacing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LetterSpacing] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineHeight extends StObject {
    
    var lg: String | Double
    
    var md: String | Double
    
    var sm: String | Double
  }
  object LineHeight {
    
    inline def apply(lg: String | Double, md: String | Double, sm: String | Double): LineHeight = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineHeight] (val x: Self) extends AnyVal {
      
      inline def setLg(value: String | Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String | Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String | Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Record<@mui/joy.@mui/joy/styles/types/typography.ExtendedTypographySystem, @mui/system.@mui/system.CSSObject> */
  trait TypographySystem extends StObject {
    
    var body1: CSSObject
    
    var body2: CSSObject
    
    var body3: CSSObject
    
    var body4: CSSObject
    
    var body5: CSSObject
    
    var display1: CSSObject
    
    var display2: CSSObject
    
    var h1: CSSObject
    
    var h2: CSSObject
    
    var h3: CSSObject
    
    var h4: CSSObject
    
    var h5: CSSObject
    
    var h6: CSSObject
  }
  object TypographySystem {
    
    inline def apply(
      body1: CSSObject,
      body2: CSSObject,
      body3: CSSObject,
      body4: CSSObject,
      body5: CSSObject,
      display1: CSSObject,
      display2: CSSObject,
      h1: CSSObject,
      h2: CSSObject,
      h3: CSSObject,
      h4: CSSObject,
      h5: CSSObject,
      h6: CSSObject
    ): TypographySystem = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], body3 = body3.asInstanceOf[js.Any], body4 = body4.asInstanceOf[js.Any], body5 = body5.asInstanceOf[js.Any], display1 = display1.asInstanceOf[js.Any], display2 = display2.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographySystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographySystem] (val x: Self) extends AnyVal {
      
      inline def setBody1(value: CSSObject): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      inline def setBody2(value: CSSObject): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      inline def setBody3(value: CSSObject): Self = StObject.set(x, "body3", value.asInstanceOf[js.Any])
      
      inline def setBody4(value: CSSObject): Self = StObject.set(x, "body4", value.asInstanceOf[js.Any])
      
      inline def setBody5(value: CSSObject): Self = StObject.set(x, "body5", value.asInstanceOf[js.Any])
      
      inline def setDisplay1(value: CSSObject): Self = StObject.set(x, "display1", value.asInstanceOf[js.Any])
      
      inline def setDisplay2(value: CSSObject): Self = StObject.set(x, "display2", value.asInstanceOf[js.Any])
      
      inline def setH1(value: CSSObject): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: CSSObject): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: CSSObject): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: CSSObject): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: CSSObject): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: CSSObject): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypographySystemOverrides extends StObject
}
