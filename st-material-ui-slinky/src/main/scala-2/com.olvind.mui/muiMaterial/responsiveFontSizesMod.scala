package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.createTypographyMod.Variant
import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveFontSizesMod {
  
  @JSImport("@mui/material/styles/responsiveFontSizes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  @scala.inline
  def default(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  @js.native
  trait ResponsiveFontSizesOptions extends StObject {
    
    var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    var disableAlign: js.UndefOr[Boolean] = js.native
    
    var factor: js.UndefOr[Double] = js.native
    
    var variants: js.UndefOr[js.Array[Variant]] = js.native
  }
  object ResponsiveFontSizesOptions {
    
    @scala.inline
    def apply(): ResponsiveFontSizesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveFontSizesOptions]
    }
    
    @scala.inline
    implicit class ResponsiveFontSizesOptionsMutableBuilder[Self <: ResponsiveFontSizesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Array[Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setBreakpointsVarargs(value: Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setDisableAlign(value: Boolean): Self = StObject.set(x, "disableAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAlignUndefined: Self = StObject.set(x, "disableAlign", js.undefined)
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      @scala.inline
      def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value :_*))
    }
  }
}
