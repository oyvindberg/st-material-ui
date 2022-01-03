package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.createTypographyMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssUtilsMod {
  
  @JSImport("@mui/material/styles/cssUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def alignProperty(params: AlignPropertyParams): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("alignProperty")(params.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def convertLength(baseFontSize: String): js.Function2[/* length */ String, /* toUnit */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLength")(baseFontSize.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* length */ String, /* toUnit */ String, String]]
  
  @scala.inline
  def fontGrid(params: FontGridParams): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fontGrid")(params.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getUnit(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnit")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isUnitless(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitless")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def responsiveProperty(params: ResponsivePropertyParams): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveProperty")(params.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  @scala.inline
  def toUnitless(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnitless")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait AlignPropertyParams extends StObject {
    
    var grid: Double = js.native
    
    var size: Double = js.native
  }
  object AlignPropertyParams {
    
    @scala.inline
    def apply(grid: Double, size: Double): AlignPropertyParams = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignPropertyParams]
    }
    
    @scala.inline
    implicit class AlignPropertyParamsMutableBuilder[Self <: AlignPropertyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(value: Double): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontGridParams extends StObject {
    
    var htmlFontSize: Double = js.native
    
    var lineHeight: Double = js.native
    
    var pixels: Double = js.native
  }
  object FontGridParams {
    
    @scala.inline
    def apply(htmlFontSize: Double, lineHeight: Double, pixels: Double): FontGridParams = {
      val __obj = js.Dynamic.literal(htmlFontSize = htmlFontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], pixels = pixels.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontGridParams]
    }
    
    @scala.inline
    implicit class FontGridParamsMutableBuilder[Self <: FontGridParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixels(value: Double): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponsivePropertyParams extends StObject {
    
    var breakpoints: js.UndefOr[js.Array[Double]] = js.native
    
    var cssProperty: String = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var transform: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    
    var unit: js.UndefOr[String] = js.native
  }
  object ResponsivePropertyParams {
    
    @scala.inline
    def apply(cssProperty: String, max: Double, min: Double): ResponsivePropertyParams = {
      val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsivePropertyParams]
    }
    
    @scala.inline
    implicit class ResponsivePropertyParamsMutableBuilder[Self <: ResponsivePropertyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setCssProperty(value: String): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: /* value */ Double => Double): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
