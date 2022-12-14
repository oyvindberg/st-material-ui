package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotProps[T /* <: String */, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, OwnerState /* <: js.Object */] extends StObject {
  
  var component: js.UndefOr[ReactElement] = js.undefined
  
  var slotProps: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ k in T ]:? ExternalSlotProps | (ownerState : OwnerState): ExternalSlotProps} */ js.Any
  ] = js.undefined
  
  var slots: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ k in T ]:? react.react.ElementType<any>} */ js.Any
  ] = js.undefined
}
object SlotProps {
  
  inline def apply[T /* <: String */, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, OwnerState /* <: js.Object */](): SlotProps[T, ExternalSlotProps, OwnerState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotProps[T, ExternalSlotProps, OwnerState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotProps[?, ?, ?], T /* <: String */, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, OwnerState /* <: js.Object */] (val x: Self & (SlotProps[T, ExternalSlotProps, OwnerState])) extends AnyVal {
    
    inline def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setSlotProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in T ]:? ExternalSlotProps | (ownerState : OwnerState): ExternalSlotProps} */ js.Any
    ): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in T ]:? react.react.ElementType<any>} */ js.Any
    ): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
