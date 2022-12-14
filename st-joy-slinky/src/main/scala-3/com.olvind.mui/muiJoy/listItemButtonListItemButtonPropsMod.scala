package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AutoFocus
import com.olvind.mui.muiJoy.anon.ListItemButtonTypeMapdivprops
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonListItemButtonPropsMod {
  
  type ExtendListItemButton[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ OverrideProps[ExtendListItemButtonTypeMap[M], "a"], Element]) & OverridableComponent[ExtendListItemButtonTypeMap[M]]
  
  trait ExtendListItemButtonTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListItemButtonTypeMapdivprops
  }
  object ExtendListItemButtonTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListItemButtonTypeMapdivprops
    ): ExtendListItemButtonTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendListItemButtonTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendListItemButtonTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendListItemButtonTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ListItemButtonTypeMapdivprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap> extends std.Function ? std.Omit<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap> : {[ K in keyof std.Omit<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap> ]: std.Omit<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemButtonPropsListItemButtonTypeMap>[K]} */ trait ListItemButtonOwnerState extends StObject {
    
    /**
      * @internal
      * The internal prop for controlling CSS margin of the element.
      */
    var `data-first-child`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the element is rendered in a horizontal list.
      * @internal
      */
    var row: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemButtonOwnerState {
    
    inline def apply(): ListItemButtonOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemButtonOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemButtonOwnerState] (val x: Self) extends AnyVal {
      
      inline def `setData-first-child`(value: Boolean): Self = StObject.set(x, "data-first-child", value.asInstanceOf[js.Any])
      
      inline def `setData-first-childUndefined`: Self = StObject.set(x, "data-first-child", js.undefined)
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  type ListItemButtonProps[D /* <: ReactElement */, P] = OverrideProps[ListItemButtonTypeMap[P, D], D]
  
  trait ListItemButtonPropsColorOverrides extends StObject
  
  trait ListItemButtonPropsVariantOverrides extends StObject
  
  type ListItemButtonSlot = "root"
  
  trait ListItemButtonTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AutoFocus
  }
  object ListItemButtonTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & AutoFocus): ListItemButtonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemButtonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemButtonTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ListItemButtonTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
