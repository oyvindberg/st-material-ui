package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  trait CreateSlotsAndSlotProps[T /* <: String */, K /* <: Record[T, Any] */] extends StObject {
    
    var slotProps: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof K ]:? K[P]} */ js.Any
      ] = js.undefined
    
    var slots: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof K ]:? react.react.ElementType<any>} */ js.Any
      ] = js.undefined
  }
  object CreateSlotsAndSlotProps {
    
    inline def apply[T /* <: String */, K /* <: Record[T, Any] */](): CreateSlotsAndSlotProps[T, K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSlotsAndSlotProps[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateSlotsAndSlotProps[?, ?], T /* <: String */, K /* <: Record[T, Any] */] (val x: Self & (CreateSlotsAndSlotProps[T, K])) extends AnyVal {
      
      inline def setSlotProps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof K ]:? K[P]} */ js.Any
      ): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof K ]:? react.react.ElementType<any>} */ js.Any
      ): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  trait SlotCommonProps extends StObject {
    
    var component: js.UndefOr[ElementType] = js.undefined
    
    var sx: js.UndefOr[SxProps] = js.undefined
  }
  object SlotCommonProps {
    
    inline def apply(): SlotCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotCommonProps] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    }
  }
  
  type SlotProps[TSlotComponent /* <: ElementType */, TOverrides, TOwnerState] = ((Omit[ComponentPropsWithRef[TSlotComponent], "color"]) & TOverrides & SlotCommonProps & (Record[String, Any])) | (js.Function1[
    /* ownerState */ TOwnerState, 
    (Omit[ComponentPropsWithRef[TSlotComponent], "color"]) & TOverrides & SlotCommonProps & (Record[String, Any])
  ])
}