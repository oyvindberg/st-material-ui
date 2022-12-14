package com.olvind.mui.muiSystem

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.anon.Mode
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeCreateThemeMod {
  
  object Direction {
    
    inline def ltr: "ltr" = "ltr".asInstanceOf["ltr"]
    
    inline def rtl: "rtl" = "rtl".asInstanceOf["rtl"]
  }
  type Direction = "ltr" | "rtl"
  
  trait Theme extends StObject {
    
    var breakpoints: Breakpoints
    
    var components: js.UndefOr[Record[String, Any]] = js.undefined
    
    var direction: Direction
    
    var mixins: js.UndefOr[Any] = js.undefined
    
    var palette: (Record[String, Any]) & Mode
    
    var shadows: js.UndefOr[Any] = js.undefined
    
    var shape: Shape
    
    var spacing: Spacing
    
    var transitions: js.UndefOr[Any] = js.undefined
    
    var typography: js.UndefOr[Any] = js.undefined
    
    def unstable_sx(props: SxProps[Theme]): CSSObject
    
    var unstable_sxConfig: SxConfig
    
    var zIndex: js.UndefOr[Any] = js.undefined
  }
  object Theme {
    
    inline def apply(
      breakpoints: Breakpoints,
      direction: Direction,
      palette: (Record[String, Any]) & Mode,
      shape: Shape,
      spacing: Spacing,
      unstable_sx: SxProps[Theme] => CSSObject,
      unstable_sxConfig: SxConfig
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: Record[String, Any]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setMixins(value: Any): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setPalette(value: (Record[String, Any]) & Mode): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadows(value: Any): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: Any): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTypography(value: Any): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setUnstable_sx(value: SxProps[Theme] => CSSObject): Self = StObject.set(x, "unstable_sx", js.Any.fromFunction1(value))
      
      inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Any): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
