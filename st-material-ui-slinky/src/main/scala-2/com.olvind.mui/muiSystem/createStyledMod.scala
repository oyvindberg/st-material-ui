package com.olvind.mui.muiSystem

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStyledMod {
  
  type CreateMUIStyled[T /* <: js.Object */] = com.olvind.mui.muiStyledEngine.mod.CreateMUIStyled[MUIStyledCommonProps[T], MuiStyledOptions, T]
  
  @js.native
  trait MUIStyledCommonProps[Theme /* <: js.Object */] extends StObject {
    
    var as: js.UndefOr[ReactElement] = js.native
    
    var sx: js.UndefOr[SxProps[Theme]] = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object MUIStyledCommonProps {
    
    @scala.inline
    def apply[Theme /* <: js.Object */](): MUIStyledCommonProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MUIStyledCommonProps[Theme]]
    }
    
    @scala.inline
    implicit class MUIStyledCommonPropsMutableBuilder[Self <: MUIStyledCommonProps[_], Theme /* <: js.Object */] (val x: Self with MUIStyledCommonProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSxNull: Self = StObject.set(x, "sx", null)
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value :_*))
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait MuiStyledOptions extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    // The difference between Interpolation and CSSInterpolation is that the former supports functions based on props
    // If we want to support props in the overrides, we will need to change the CSSInterpolation to Interpolation<Props>
    var overridesResolver: js.UndefOr[
        js.Function2[/* props */ Any, /* styles */ Record[String, CSSInterpolation], CSSInterpolation]
      ] = js.native
    
    var skipSx: js.UndefOr[Boolean] = js.native
    
    var skipVariantsResolver: js.UndefOr[Boolean] = js.native
    
    var slot: js.UndefOr[String] = js.native
  }
  object MuiStyledOptions {
    
    @scala.inline
    def apply(): MuiStyledOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MuiStyledOptions]
    }
    
    @scala.inline
    implicit class MuiStyledOptionsMutableBuilder[Self <: MuiStyledOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverridesResolver(value: (/* props */ Any, /* styles */ Record[String, CSSInterpolation]) => CSSInterpolation): Self = StObject.set(x, "overridesResolver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOverridesResolverUndefined: Self = StObject.set(x, "overridesResolver", js.undefined)
      
      @scala.inline
      def setSkipSx(value: Boolean): Self = StObject.set(x, "skipSx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSxUndefined: Self = StObject.set(x, "skipSx", js.undefined)
      
      @scala.inline
      def setSkipVariantsResolver(value: Boolean): Self = StObject.set(x, "skipVariantsResolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipVariantsResolverUndefined: Self = StObject.set(x, "skipVariantsResolver", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    }
  }
}
