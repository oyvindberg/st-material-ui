package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.createMixinsMod.MixinsOptions
import com.olvind.mui.muiMaterial.createPaletteMod.Palette
import com.olvind.mui.muiMaterial.createPaletteMod.PaletteOptions
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.createTransitionsMod.TransitionsOptions
import com.olvind.mui.muiMaterial.createTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.overridesMod.ComponentsOverrides
import com.olvind.mui.muiMaterial.propsMod.ComponentsProps
import com.olvind.mui.muiMaterial.shadowsMod.Shadows
import com.olvind.mui.muiMaterial.variantsMod.ComponentsVariants
import com.olvind.mui.muiMaterial.zIndexMod.ZIndexOptions
import com.olvind.mui.muiSystem.createBreakpointsMod.BreakpointsOptions
import com.olvind.mui.muiSystem.createSpacingMod.SpacingOptions
import com.olvind.mui.muiSystem.shapeMod.ShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptV4ThemeMod {
  
  @JSImport("@mui/material/styles/adaptV4Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Theme]
  @scala.inline
  def default(options: DeprecatedThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  @js.native
  trait DeprecatedThemeOptions extends StObject {
    
    var breakpoints: js.UndefOr[BreakpointsOptions] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var mixins: js.UndefOr[MixinsOptions] = js.native
    
    var overrides: js.UndefOr[ComponentsOverrides] = js.native
    
    var palette: js.UndefOr[PaletteOptions] = js.native
    
    var props: js.UndefOr[ComponentsProps] = js.native
    
    var shadows: js.UndefOr[Shadows] = js.native
    
    var shape: js.UndefOr[ShapeOptions] = js.native
    
    var spacing: js.UndefOr[SpacingOptions] = js.native
    
    var transitions: js.UndefOr[TransitionsOptions] = js.native
    
    var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.native
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.native
    
    var variants: js.UndefOr[ComponentsVariants] = js.native
    
    var zIndex: js.UndefOr[ZIndexOptions] = js.native
  }
  object DeprecatedThemeOptions {
    
    @scala.inline
    def apply(): DeprecatedThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedThemeOptions]
    }
    
    @scala.inline
    implicit class DeprecatedThemeOptionsMutableBuilder[Self <: DeprecatedThemeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setOverrides(value: ComponentsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      @scala.inline
      def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingFunction1(value: (/* abs */ Double) | String => Double | String): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpacingVarargs(value: (String | Double)*): Self = StObject.set(x, "spacing", js.Array(value :_*))
      
      @scala.inline
      def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      @scala.inline
      def setVariants(value: ComponentsVariants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ltr
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.rtl
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def ltr: com.olvind.mui.muiMaterial.muiMaterialStrings.ltr = "ltr".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.ltr]
    
    @scala.inline
    def rtl: com.olvind.mui.muiMaterial.muiMaterialStrings.rtl = "rtl".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.rtl]
  }
}
