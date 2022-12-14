package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Node
import com.olvind.mui.muiMaterial.anon.PartialMenuProps
import com.olvind.mui.muiMaterial.anon.Target
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.JSXElementConstructor
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectInputMod extends Shortcut {
  
  @JSImport("@mui/material/Select/SelectInput", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[SelectInputProps[Any]] = js.native
  
  type SelectChangeEvent[T] = (Event & Target[T]) | ReactEventFrom[HTMLInputElement]
  
  trait SelectInputProps[T] extends StObject {
    
    var IconComponent: js.UndefOr[ElementType] = js.undefined
    
    var MenuProps: js.UndefOr[PartialMenuProps] = js.undefined
    
    var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoWidth: Boolean
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Node[T], Unit]] = js.undefined
    
    var multiple: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    var native: Boolean
    
    var onBlur: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ SelectChangeEvent[T], 
          /* child */ japgolly.scalajs.react.facade.React.Node, 
          Unit
        ]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderValue: js.UndefOr[
        js.Function1[/* value */ js.UndefOr[T], japgolly.scalajs.react.facade.React.Node]
      ] = js.undefined
    
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
    
    var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
  }
  object SelectInputProps {
    
    inline def apply[T](autoWidth: Boolean, multiple: Boolean, native: Boolean): SelectInputProps[T] = {
      val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInputProps[T]]
    }
    
    extension [Self <: SelectInputProps[?], T](x: Self & SelectInputProps[T]) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIconComponent(value: ElementType): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      inline def setInputRef(value: /* ref */ HTMLSelectElement | Node[T] => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: /* ref */ HTMLSelectElement | Node[T]) => value(t0).runNow()))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMenuProps(value: PartialMenuProps): Self = StObject.set(x, "MenuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "MenuProps", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ SelectChangeEvent[T], /* child */ japgolly.scalajs.react.facade.React.Node) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ SelectChangeEvent[T], t1: /* child */ japgolly.scalajs.react.facade.React.Node) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnOpen(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderValue(value: /* value */ js.UndefOr[T] => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      inline def setSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "SelectDisplayProps", value.asInstanceOf[js.Any])
      
      inline def setSelectDisplayPropsUndefined: Self = StObject.set(x, "SelectDisplayProps", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[SelectInputProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `selectSelectInputMod.foo` */
  override def _to: JSXElementConstructor[SelectInputProps[Any]] = default
}
