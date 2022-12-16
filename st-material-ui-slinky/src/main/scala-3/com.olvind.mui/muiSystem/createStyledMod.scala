package com.olvind.mui.muiSystem

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStyledMod {
  
  type CreateMUIStyled[T /* <: js.Object */] = com.olvind.mui.muiStyledEngine.mod.CreateMUIStyled[MUIStyledCommonProps[T], MuiStyledOptions, T]
  
  trait MUIStyledCommonProps[Theme /* <: js.Object */] extends StObject {
    
    var as: js.UndefOr[ReactElement] = js.undefined
    
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object MUIStyledCommonProps {
    
    inline def apply[Theme /* <: js.Object */](): MUIStyledCommonProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MUIStyledCommonProps[Theme]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MUIStyledCommonProps[?], Theme /* <: js.Object */] (val x: Self & MUIStyledCommonProps[Theme]) extends AnyVal {
      
      inline def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait MuiStyledOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    // The difference between Interpolation and CSSInterpolation is that the former supports functions based on props
    // If we want to support props in the overrides, we will need to change the CSSInterpolation to Interpolation<Props>
    var overridesResolver: js.UndefOr[
        js.Function2[/* props */ Any, /* styles */ Record[String, CSSInterpolation], CSSInterpolation]
      ] = js.undefined
    
    var skipSx: js.UndefOr[Boolean] = js.undefined
    
    var skipVariantsResolver: js.UndefOr[Boolean] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
  }
  object MuiStyledOptions {
    
    inline def apply(): MuiStyledOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MuiStyledOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MuiStyledOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverridesResolver(value: (/* props */ Any, /* styles */ Record[String, CSSInterpolation]) => CSSInterpolation): Self = StObject.set(x, "overridesResolver", js.Any.fromFunction2(value))
      
      inline def setOverridesResolverUndefined: Self = StObject.set(x, "overridesResolver", js.undefined)
      
      inline def setSkipSx(value: Boolean): Self = StObject.set(x, "skipSx", value.asInstanceOf[js.Any])
      
      inline def setSkipSxUndefined: Self = StObject.set(x, "skipSx", js.undefined)
      
      inline def setSkipVariantsResolver(value: Boolean): Self = StObject.set(x, "skipVariantsResolver", value.asInstanceOf[js.Any])
      
      inline def setSkipVariantsResolverUndefined: Self = StObject.set(x, "skipVariantsResolver", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    }
  }
}
