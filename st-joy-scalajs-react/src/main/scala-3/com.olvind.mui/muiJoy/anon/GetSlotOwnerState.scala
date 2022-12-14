package com.olvind.mui.muiJoy.anon

import com.olvind.mui.clsx.mod.ClassValue
import com.olvind.mui.muiJoy.utilsUseSlotMod.EventHandlers
import com.olvind.mui.muiJoy.utilsUseSlotMod.ExtractComponentProps
import com.olvind.mui.muiJoy.utilsUseSlotMod.WithCommonProps
import com.olvind.mui.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotOwnerState[ElementType /* <: japgolly.scalajs.react.facade.React.ElementType */, OwnerState /* <: js.Object */, ExternalForwardedProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   slots :{[ k in T ]:? react.react.ElementType<any>} | undefined,   slotProps :{[ k in T ]:? ExternalSlotProps | (ownerState : OwnerState): ExternalSlotProps} | undefined} */ js.Any */, SlotProps, AdditionalProps, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, T /* <: String */, SlotOwnerState /* <: js.Object */] extends StObject {
  
  var additionalProps: js.UndefOr[WithCommonProps[AdditionalProps]] = js.undefined
  
  /**
    * The slot's className
    */
  var className: ClassValue | js.Array[ClassValue]
  
  /**
    * The slot's default styled-component
    */
  var elementType: ElementType
  
  /**
    * The `other` props from the consumer. It has to contain `component`, `slots`, and `slotProps`.
    * The function will use those props to calculate the final rendered element and the returned props.
    *
    * If the slot is not `root`, the rest of the `externalForwardedProps` are neglected.
    */
  var externalForwardedProps: ExternalForwardedProps
  
  /**
    * For overriding the component's ownerState for the slot.
    * This is required for some components that need styling via `ownerState`.
    *
    * It is a function because `slotProps.{slot}` can be a function which has to be resolved first.
    */
  var getSlotOwnerState: js.UndefOr[
    js.Function1[
      /* mergedProps */ AdditionalProps & SlotProps & ExternalSlotProps & (ExtractComponentProps[
        Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<ExternalForwardedProps['slotProps'], undefined>[T] */ js.Any, 
          Unit
        ]
      ]), 
      SlotOwnerState
    ]
  ] = js.undefined
  
  var getSlotProps: js.UndefOr[js.Function1[/* other */ EventHandlers, WithCommonProps[SlotProps]]] = js.undefined
  
  /**
    * props forward to `T` only if the `slotProps.*.component` is not provided.
    * e.g. Autocomplete's listbox uses PopperUnstyled + StyledComponent
    */
  var internalForwardedProps: js.UndefOr[Any] = js.undefined
  
  /**
    * The component's ownerState
    */
  var ownerState: OwnerState
}
object GetSlotOwnerState {
  
  inline def apply[ElementType /* <: japgolly.scalajs.react.facade.React.ElementType */, OwnerState /* <: js.Object */, ExternalForwardedProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   slots :{[ k in T ]:? react.react.ElementType<any>} | undefined,   slotProps :{[ k in T ]:? ExternalSlotProps | (ownerState : OwnerState): ExternalSlotProps} | undefined} */ js.Any */, SlotProps, AdditionalProps, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, T /* <: String */, SlotOwnerState /* <: js.Object */](elementType: ElementType, externalForwardedProps: ExternalForwardedProps, ownerState: OwnerState): GetSlotOwnerState[
    ElementType, 
    OwnerState, 
    ExternalForwardedProps, 
    SlotProps, 
    AdditionalProps, 
    ExternalSlotProps, 
    T, 
    SlotOwnerState
  ] = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], externalForwardedProps = externalForwardedProps.asInstanceOf[js.Any], ownerState = ownerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotOwnerState[
    ElementType, 
    OwnerState, 
    ExternalForwardedProps, 
    SlotProps, 
    AdditionalProps, 
    ExternalSlotProps, 
    T, 
    SlotOwnerState
  ]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSlotOwnerState[?, ?, ?, ?, ?, ?, ?, ?], ElementType /* <: japgolly.scalajs.react.facade.React.ElementType */, OwnerState /* <: js.Object */, ExternalForwardedProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   slots :{[ k in T ]:? react.react.ElementType<any>} | undefined,   slotProps :{[ k in T ]:? ExternalSlotProps | (ownerState : OwnerState): ExternalSlotProps} | undefined} */ js.Any */, SlotProps, AdditionalProps, ExternalSlotProps /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  component :react.react.ElementType<any> | undefined,   ref :react.react.Ref<any> | undefined} */ js.Any */, T /* <: String */, SlotOwnerState /* <: js.Object */] (val x: Self & (GetSlotOwnerState[
        ElementType, 
        OwnerState, 
        ExternalForwardedProps, 
        SlotProps, 
        AdditionalProps, 
        ExternalSlotProps, 
        T, 
        SlotOwnerState
      ])) extends AnyVal {
    
    inline def setAdditionalProps(value: WithCommonProps[AdditionalProps]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
    
    inline def setClassName(value: ClassValue | js.Array[ClassValue]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNameVarargs(value: ClassValue*): Self = StObject.set(x, "className", js.Array(value*))
    
    inline def setElementType(value: ElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setExternalForwardedProps(value: ExternalForwardedProps): Self = StObject.set(x, "externalForwardedProps", value.asInstanceOf[js.Any])
    
    inline def setGetSlotOwnerState(
      value: /* mergedProps */ AdditionalProps & SlotProps & ExternalSlotProps & (ExtractComponentProps[
          Exclude[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<ExternalForwardedProps['slotProps'], undefined>[T] */ js.Any, 
            Unit
          ]
        ]) => SlotOwnerState
    ): Self = StObject.set(x, "getSlotOwnerState", js.Any.fromFunction1(value))
    
    inline def setGetSlotOwnerStateUndefined: Self = StObject.set(x, "getSlotOwnerState", js.undefined)
    
    inline def setGetSlotProps(value: /* other */ EventHandlers => WithCommonProps[SlotProps]): Self = StObject.set(x, "getSlotProps", js.Any.fromFunction1(value))
    
    inline def setGetSlotPropsUndefined: Self = StObject.set(x, "getSlotProps", js.undefined)
    
    inline def setInternalForwardedProps(value: Any): Self = StObject.set(x, "internalForwardedProps", value.asInstanceOf[js.Any])
    
    inline def setInternalForwardedPropsUndefined: Self = StObject.set(x, "internalForwardedProps", js.undefined)
    
    inline def setOwnerState(value: OwnerState): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
  }
}
