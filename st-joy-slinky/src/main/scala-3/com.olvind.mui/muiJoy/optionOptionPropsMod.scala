package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.useListboxUseListboxDottypesMod.OptionState
import com.olvind.mui.muiJoy.anon.OptionTypeMapliprops
import com.olvind.mui.muiJoy.anon.Value
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionOptionPropsMod {
  
  type ExtendOption[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ OverrideProps[ExtendOptionTypeMap[M], "a"], Element]) & OverridableComponent[ExtendOptionTypeMap[M]]
  
  trait ExtendOptionTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OptionTypeMapliprops
  }
  object ExtendOptionTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OptionTypeMapliprops
    ): ExtendOptionTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendOptionTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendOptionTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendOptionTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OptionTypeMapliprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom> extends std.Function ? std.Omit<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom> : {[ K in keyof std.Omit<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom> ]: std.Omit<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.OmitOptionPropsOptionTypeMaplidefaultCom>[K]} */ trait OptionOwnerState
    extends StObject
       with OptionState
  object OptionOwnerState {
    
    inline def apply(disabled: Boolean, highlighted: Boolean, index: Double, selected: Boolean): OptionOwnerState = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionOwnerState]
    }
  }
  
  type OptionProps[D /* <: ReactElement */, P] = OverrideProps[OptionTypeMap[P, D], D]
  
  trait OptionPropsColorOverrides extends StObject
  
  trait OptionPropsVariantOverrides extends StObject
  
  type OptionSlot = "root"
  
  trait OptionTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Value
  }
  object OptionTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Value): OptionTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (OptionTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Value): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
