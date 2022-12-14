package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.FocusVisibleClassName
import com.olvind.mui.muiJoy.anon.IconButtonTypeMapbuttonprops
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonPropsMod {
  
  type ExtendIconButton[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ OverrideProps[ExtendIconButtonTypeMap[M], "a"], Element]) & OverridableComponent[ExtendIconButtonTypeMap[M]]
  
  trait ExtendIconButtonTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & IconButtonTypeMapbuttonprops
  }
  object ExtendIconButtonTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & IconButtonTypeMapbuttonprops
    ): ExtendIconButtonTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendIconButtonTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendIconButtonTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendIconButtonTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & IconButtonTypeMapbuttonprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde> extends std.Function ? std.Omit<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde> : {[ K in keyof std.Omit<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde> ]: std.Omit<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.IconButtonPropsIconButtonTypeMapbuttonde>[K]} */ trait IconButtonOwnerState extends StObject {
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object IconButtonOwnerState {
    
    inline def apply(): IconButtonOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type IconButtonProps[D /* <: ReactElement */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  trait IconButtonPropsColorOverrides extends StObject
  
  trait IconButtonPropsSizeOverrides extends StObject
  
  trait IconButtonPropsVariantOverrides extends StObject
  
  type IconButtonSlot = "root"
  
  trait IconButtonTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & FocusVisibleClassName
  }
  object IconButtonTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & FocusVisibleClassName): IconButtonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (IconButtonTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FocusVisibleClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
