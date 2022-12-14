package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ListItemButtonPropsListItemButtonTypeMap
import com.olvind.mui.muiJoy.anon.MenuItemTypeMapdivprops
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemPropsMod {
  
  type ExtendMenuItem[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ OverrideProps[ExtendMenuItemTypeMap[M], "a"], Element]) & OverridableComponent[ExtendMenuItemTypeMap[M]]
  
  trait ExtendMenuItemTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & MenuItemTypeMapdivprops
  }
  object ExtendMenuItemTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & MenuItemTypeMapdivprops
    ): ExtendMenuItemTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendMenuItemTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendMenuItemTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendMenuItemTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & MenuItemTypeMapdivprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo> extends std.Function ? std.Omit<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo> : {[ K in keyof std.Omit<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo> ]: std.Omit<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.61<@mui/joy.anon.MenuItemPropsMenuItemTypeMapdivdefaultCo>[K]} */ trait MenuItemOwnerState extends StObject {
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemOwnerState {
    
    inline def apply(): MenuItemOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type MenuItemProps[D /* <: ReactElement */, P] = OverrideProps[MenuItemTypeMap[P, D], D]
  
  trait MenuItemPropsColorOverrides extends StObject
  
  trait MenuItemPropsVariantOverrides extends StObject
  
  type MenuItemSlot = "root"
  
  trait MenuItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ListItemButtonPropsListItemButtonTypeMap
  }
  object MenuItemTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ListItemButtonPropsListItemButtonTypeMap): MenuItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (MenuItemTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ListItemButtonPropsListItemButtonTypeMap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
