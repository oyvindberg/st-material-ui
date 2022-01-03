package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Node
import com.olvind.mui.muiMaterial.anon.PartialMenuProps
import com.olvind.mui.muiMaterial.anon.Target
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectInputMod extends Shortcut {
  
  @JSImport("@mui/material/Select/SelectInput", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[SelectInputProps[Any]] = js.native
  
  type SelectChangeEvent[T] = (Event with Target[T]) | ChangeEvent[HTMLInputElement]
  
  @js.native
  trait SelectInputProps[T] extends StObject {
    
    var IconComponent: js.UndefOr[ReactElement] = js.native
    
    var MenuProps: js.UndefOr[PartialMenuProps] = js.native
    
    var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoWidth: Boolean = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Node[T], Unit]] = js.native
    
    var multiple: Boolean = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var native: Boolean = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[Any]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* event */ SelectChangeEvent[T], /* child */ ReactElement, Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[Any]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var renderValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[T], ReactElement]] = js.native
    
    var sx: js.UndefOr[SxProps[Theme]] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[T] = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object SelectInputProps {
    
    @scala.inline
    def apply[T](autoWidth: Boolean, multiple: Boolean, native: Boolean): SelectInputProps[T] = {
      val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInputProps[T]]
    }
    
    @scala.inline
    implicit class SelectInputPropsMutableBuilder[Self <: SelectInputProps[_], T] (val x: Self with SelectInputProps[T]) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIconComponent(value: ReactElement): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* ref */ HTMLSelectElement | Node[T] => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMenuProps(value: PartialMenuProps): Self = StObject.set(x, "MenuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPropsUndefined: Self = StObject.set(x, "MenuProps", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ SelectChangeEvent[T], /* child */ ReactElement) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderValue(value: /* value */ js.UndefOr[T] => ReactElement): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      @scala.inline
      def setSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "SelectDisplayProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectDisplayPropsUndefined: Self = StObject.set(x, "SelectDisplayProps", js.undefined)
      
      @scala.inline
      def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSxNull: Self = StObject.set(x, "sx", null)
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value :_*))
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[SelectInputProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `selectInputMod.foo` */
  override def _to: JSXElementConstructor[SelectInputProps[Any]] = default
}
