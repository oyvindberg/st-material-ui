package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledActions
import com.olvind.mui.muiJoy.menuMenuPropsMod.MenuPropsColorOverrides
import com.olvind.mui.muiJoy.menuMenuPropsMod.MenuPropsSizeOverrides
import com.olvind.mui.muiJoy.menuMenuPropsMod.MenuPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  /**
    * A ref with imperative actions.
    * It allows to select the first or last menu item.
    */
  var actions: js.UndefOr[com.olvind.mui.react.mod.Ref[MenuUnstyledActions]] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, MenuPropsColorOverrides]] = js.undefined
  
  /**
    * Triggered when focus leaves the menu and the menu should close.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Controls whether the menu is displayed.
    * @default false
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component (affect other nested list* components because the `Menu` inherits `List`).
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", MenuPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'outlined'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, MenuPropsVariantOverrides]] = js.undefined
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: com.olvind.mui.react.mod.Ref[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction1(value: MenuUnstyledActions | Null => Callback): Self = StObject.set(x, "actions", js.Any.fromFunction1((t0: MenuUnstyledActions | Null) => value(t0).runNow()))
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, MenuPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", MenuPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, MenuPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
