package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.CardPropsCardTypeMapdivdefaultComponent
import com.olvind.mui.muiJoy.anon.InvertedColors
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardPropsMod {
  
  type CardOwnerState = ApplyColorInversion[CardPropsCardTypeMapdivdefaultComponent]
  
  type CardProps[D /* <: ReactElement */, P] = OverrideProps[CardTypeMap[P, D], D]
  
  trait CardPropsColorOverrides extends StObject
  
  trait CardPropsSizeOverrides extends StObject
  
  trait CardPropsVariantOverrides extends StObject
  
  type CardSlot = "root"
  
  trait CardTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & InvertedColors
  }
  object CardTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & InvertedColors): CardTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (CardTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & InvertedColors): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
