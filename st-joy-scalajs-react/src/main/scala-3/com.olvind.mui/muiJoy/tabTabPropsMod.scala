package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OnChange
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent> extends std.Function ? std.Omit<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent> : {[ K in keyof std.Omit<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent> ]: std.Omit<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabPropsTabTypeMapbuttondefaultComponent>[K]} */ trait TabOwnerState extends StObject {
    
    /**
      * If `true`, the tab is activated by mouse or keyboard.
      */
    var active: Boolean
    
    /**
      * If `true`, the tab is disabled.
      */
    var disabled: Boolean
    
    /**
      * If `true`, the tab's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @internal
      */
    var row: Boolean
    
    /**
      * If `true`, the tab is disabled.
      */
    var selected: Boolean
  }
  object TabOwnerState {
    
    inline def apply(active: Boolean, disabled: Boolean, row: Boolean, selected: Boolean): TabOwnerState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabOwnerState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  type TabProps[D /* <: ElementType */, P] = OverrideProps[TabTypeMap[P, D], D]
  
  trait TabPropsColorOverrides extends StObject
  
  trait TabPropsVariantOverrides extends StObject
  
  type TabSlot = "root"
  
  trait TabTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OnChange
  }
  object TabTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & OnChange): TabTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TabTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OnChange): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
