package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledActions
import com.olvind.mui.muiJoy.menuListMenuListPropsMod.MenuListPropsColorOverrides
import com.olvind.mui.muiJoy.menuListMenuListPropsMod.MenuListPropsSizeOverrides
import com.olvind.mui.muiJoy.menuListMenuListPropsMod.MenuListPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsColor extends StObject {
  
  /**
    * A ref with imperative actions.
    * It allows to select the first or last menu item.
    */
  var actions: js.UndefOr[com.olvind.mui.react.mod.Ref[MenuUnstyledActions]] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, MenuListPropsColorOverrides]] = js.undefined
  
  /**
    * The size of the component (affect other nested list* components because the `Menu` inherits `List`).
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", MenuListPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, MenuListPropsVariantOverrides]] = js.undefined
}
object ActionsColor {
  
  inline def apply(): ActionsColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionsColor] (val x: Self) extends AnyVal {
    
    inline def setActions(value: com.olvind.mui.react.mod.Ref[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction1(value: /* instance */ MenuUnstyledActions | Null => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction1(value))
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setActionsReactRef(value: ReactRef[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, MenuListPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", MenuListPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, MenuListPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
