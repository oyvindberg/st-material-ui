package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Focused
import com.olvind.mui.muiBase.anon.MultiLineInputUnstyledPropsOmitUseInputP
import com.olvind.mui.muiBase.anon.SingleLineInputUnstyledPropsOmitUseInput
import com.olvind.mui.muiBase.anon.`4`
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.muiTypes.mod.Simplify
import com.olvind.mui.std.Omit
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUnstyledInputUnstyledDottypesMod {
  
  trait InputUnstyledComponentsPropsOverrides extends StObject
  
  type InputUnstyledOwnProps = SingleLineInputUnstyledPropsOmitUseInput | MultiLineInputUnstyledPropsOmitUseInputP
  
  type InputUnstyledOwnerState = Simplify[
    (Omit[InputUnstyledProps["div", js.Object], "component" | "slots" | "slotProps"]) & Focused
  ]
  
  type InputUnstyledProps[D /* <: ReactElement */, P] = (OverrideProps[InputUnstyledTypeMap[P, D], D]) & `4`[D]
  
  trait InputUnstyledTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & InputUnstyledOwnProps
  }
  object InputUnstyledTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & InputUnstyledOwnProps): InputUnstyledTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputUnstyledTypeMap[P, D]]
    }
    
    extension [Self <: InputUnstyledTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (InputUnstyledTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & InputUnstyledOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
