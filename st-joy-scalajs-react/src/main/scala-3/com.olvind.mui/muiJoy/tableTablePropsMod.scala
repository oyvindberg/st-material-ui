package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.BorderAxis
import com.olvind.mui.muiJoy.anon.TablePropsTableTypeMaptabledefaultCompon
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTablePropsMod {
  
  type TableOwnerState = ApplyColorInversion[TablePropsTableTypeMaptabledefaultCompon]
  
  type TableProps[D /* <: ElementType */, P] = OverrideProps[TableTypeMap[P, D], D]
  
  trait TablePropsBorderAxisOverrides extends StObject
  
  trait TablePropsColorOverrides extends StObject
  
  trait TablePropsSizeOverrides extends StObject
  
  trait TablePropsVariantOverrides extends StObject
  
  type TableSlot = "root"
  
  trait TableTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & BorderAxis
  }
  object TableTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & BorderAxis): TableTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TableTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & BorderAxis): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
