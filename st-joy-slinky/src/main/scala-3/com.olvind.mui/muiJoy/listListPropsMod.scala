package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Orientation
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent> extends std.Function ? std.Omit<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent> : {[ K in keyof std.Omit<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent> ]: std.Omit<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListPropsListTypeMapuldefaultComponent>[K]} */ trait ListOwnerState extends StObject {
    
    /**
      * @internal
      * The explicit size specified on the element instance.
      */
    var instanceSize: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", ListPropsSizeOverrides]] = js.undefined
    
    /**
      * @internal
      * If `true`, the element is rendered in a nested list item.
      */
    var nesting: js.UndefOr[Boolean | String] = js.undefined
  }
  object ListOwnerState {
    
    inline def apply(): ListOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListOwnerState] (val x: Self) extends AnyVal {
      
      inline def setInstanceSize(value: OverridableStringUnion["sm" | "md" | "lg", ListPropsSizeOverrides]): Self = StObject.set(x, "instanceSize", value.asInstanceOf[js.Any])
      
      inline def setInstanceSizeUndefined: Self = StObject.set(x, "instanceSize", js.undefined)
      
      inline def setNesting(value: Boolean | String): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setNestingUndefined: Self = StObject.set(x, "nesting", js.undefined)
    }
  }
  
  type ListProps[D /* <: ReactElement */, P] = OverrideProps[ListTypeMap[P, D], D]
  
  trait ListPropsColorOverrides extends StObject
  
  trait ListPropsSizeOverrides extends StObject
  
  trait ListPropsVariantOverrides extends StObject
  
  type ListSlot = "root"
  
  trait ListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Orientation
  }
  object ListTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Orientation): ListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ListTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Orientation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
