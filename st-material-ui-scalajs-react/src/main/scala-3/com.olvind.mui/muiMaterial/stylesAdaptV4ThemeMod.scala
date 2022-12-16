package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.MixinsOptions
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.PaletteOptions
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.TransitionsOptions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.stylesOverridesMod.ComponentsOverrides
import com.olvind.mui.muiMaterial.stylesPropsMod.ComponentsProps
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesVariantsMod.ComponentsVariants
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndexOptions
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.BreakpointsOptions
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.SpacingOptions
import com.olvind.mui.muiSystem.createThemeShapeMod.ShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesAdaptV4ThemeMod {
  
  @JSImport("@mui/material/styles/adaptV4Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Theme]
  inline def default(options: DeprecatedThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  trait DeprecatedThemeOptions extends StObject {
    
    var breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var mixins: js.UndefOr[MixinsOptions] = js.undefined
    
    var overrides: js.UndefOr[ComponentsOverrides[Any]] = js.undefined
    
    var palette: js.UndefOr[PaletteOptions] = js.undefined
    
    var props: js.UndefOr[ComponentsProps] = js.undefined
    
    var shadows: js.UndefOr[Shadows] = js.undefined
    
    var shape: js.UndefOr[ShapeOptions] = js.undefined
    
    var spacing: js.UndefOr[SpacingOptions] = js.undefined
    
    var transitions: js.UndefOr[TransitionsOptions] = js.undefined
    
    var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.undefined
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
    
    var variants: js.UndefOr[ComponentsVariants] = js.undefined
    
    var zIndex: js.UndefOr[ZIndexOptions] = js.undefined
  }
  object DeprecatedThemeOptions {
    
    inline def apply(): DeprecatedThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedThemeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeprecatedThemeOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setOverrides(value: ComponentsOverrides[Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction1(value: (/* abs */ Double) | String => Double | String): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpacingVarargs(value: (String | Double)*): Self = StObject.set(x, "spacing", js.Array(value*))
      
      inline def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      inline def setVariants(value: ComponentsVariants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  object Direction {
    
    inline def ltr: "ltr" = "ltr".asInstanceOf["ltr"]
    
    inline def rtl: "rtl" = "rtl".asInstanceOf["rtl"]
  }
  type Direction = "ltr" | "rtl"
}
