package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.CardOverflowPropsCardOverflowTypeMapdivd
import com.olvind.mui.muiJoy.anon.SxVariant
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardOverflowCardOverflowPropsMod {
  
  type CardOverflowOwnerState = ApplyColorInversion[CardOverflowPropsCardOverflowTypeMapdivd]
  
  type CardOverflowProps[D /* <: ElementType */, P] = OverrideProps[CardOverflowTypeMap[P, D], D]
  
  trait CardOverflowPropsColorOverrides extends StObject
  
  trait CardOverflowPropsVariantOverrides extends StObject
  
  type CardOverflowSlot = "root"
  
  trait CardOverflowTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SxVariant
  }
  object CardOverflowTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & SxVariant): CardOverflowTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardOverflowTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardOverflowTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (CardOverflowTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SxVariant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
