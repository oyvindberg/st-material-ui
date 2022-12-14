package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgeOrigin
import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgePropsColorOverrides
import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgePropsSizeOverrides
import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgePropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorOrigin extends StObject {
  
  /**
    * The anchor of the badge.
    * @default {
    *   vertical: 'top',
    *   horizontal: 'right',
    * }
    */
  var anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined
  
  /**
    * The content rendered within the badge.
    * @default ''
    */
  var badgeContent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The inset of the badge. Support shorthand syntax as described in https://developer.mozilla.org/en-US/docs/Web/CSS/inset.
    * @default 0
    */
  var badgeInset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, BadgePropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the badge is invisible.
    * @default false
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max count to show.
    * @default 99
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the badge is hidden when `badgeContent` is zero.
    * @default false
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", BadgePropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'solid'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, BadgePropsVariantOverrides]] = js.undefined
}
object AnchorOrigin {
  
  inline def apply(): AnchorOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnchorOrigin] (val x: Self) extends AnyVal {
    
    inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setBadgeContent(value: ReactElement): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    inline def setBadgeInset(value: Double | String): Self = StObject.set(x, "badgeInset", value.asInstanceOf[js.Any])
    
    inline def setBadgeInsetUndefined: Self = StObject.set(x, "badgeInset", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, BadgePropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", BadgePropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, BadgePropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
