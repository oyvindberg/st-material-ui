package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ReactEventHandler
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationUsePaginationMod {
  
  @JSImport("@mui/material/usePagination/usePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  trait UsePaginationItem extends StObject {
    
    var disabled: Boolean
    
    var onClick: ReactEventHandler[Element]
    
    var page: Double | Null
    
    var selected: Boolean
    
    var `type`: "page" | "first" | "last" | "next" | "previous" | "start-ellipsis" | "end-ellipsis"
  }
  object UsePaginationItem {
    
    inline def apply(
      disabled: Boolean,
      onClick: SyntheticEvent[Event, Element] => Unit,
      selected: Boolean,
      `type`: "page" | "first" | "last" | "next" | "previous" | "start-ellipsis" | "end-ellipsis"
    ): UsePaginationItem = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), selected = selected.asInstanceOf[js.Any], page = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePaginationItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsePaginationItem] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageNull: Self = StObject.set(x, "page", null)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setType(value: "page" | "first" | "last" | "next" | "previous" | "start-ellipsis" | "end-ellipsis"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsePaginationProps extends StObject {
    
    /**
      * Number of always visible pages at the beginning and end.
      * @default 1
      */
    var boundaryCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the component where this hook is used.
      */
    var componentName: js.UndefOr[String] = js.undefined
    
    /**
      * The total number of pages.
      * @default 1
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * The page selected by default when the component is uncontrolled.
      * @default 1
      */
    var defaultPage: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, hide the next-page button.
      * @default false
      */
    var hideNextButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, hide the previous-page button.
      * @default false
      */
    var hidePrevButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback fired when the page is changed.
      *
      * @param {React.ChangeEvent<unknown>} event The event source of the callback.
      * @param {number} page The page selected.
      */
    var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[Any], /* page */ Double, Unit]] = js.undefined
    
    /**
      * The current page.
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, show the first-page button.
      * @default false
      */
    var showFirstButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, show the last-page button.
      * @default false
      */
    var showLastButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of always visible pages before and after the current page.
      * @default 1
      */
    var siblingCount: js.UndefOr[Double] = js.undefined
  }
  object UsePaginationProps {
    
    inline def apply(): UsePaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsePaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsePaginationProps] (val x: Self) extends AnyVal {
      
      inline def setBoundaryCount(value: Double): Self = StObject.set(x, "boundaryCount", value.asInstanceOf[js.Any])
      
      inline def setBoundaryCountUndefined: Self = StObject.set(x, "boundaryCount", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultPage(value: Double): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideNextButton(value: Boolean): Self = StObject.set(x, "hideNextButton", value.asInstanceOf[js.Any])
      
      inline def setHideNextButtonUndefined: Self = StObject.set(x, "hideNextButton", js.undefined)
      
      inline def setHidePrevButton(value: Boolean): Self = StObject.set(x, "hidePrevButton", value.asInstanceOf[js.Any])
      
      inline def setHidePrevButtonUndefined: Self = StObject.set(x, "hidePrevButton", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[Any], /* page */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setShowFirstButton(value: Boolean): Self = StObject.set(x, "showFirstButton", value.asInstanceOf[js.Any])
      
      inline def setShowFirstButtonUndefined: Self = StObject.set(x, "showFirstButton", js.undefined)
      
      inline def setShowLastButton(value: Boolean): Self = StObject.set(x, "showLastButton", value.asInstanceOf[js.Any])
      
      inline def setShowLastButtonUndefined: Self = StObject.set(x, "showLastButton", js.undefined)
      
      inline def setSiblingCount(value: Double): Self = StObject.set(x, "siblingCount", value.asInstanceOf[js.Any])
      
      inline def setSiblingCountUndefined: Self = StObject.set(x, "siblingCount", js.undefined)
    }
  }
  
  trait UsePaginationResult extends StObject {
    
    var items: js.Array[UsePaginationItem]
  }
  object UsePaginationResult {
    
    inline def apply(items: js.Array[UsePaginationItem]): UsePaginationResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePaginationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsePaginationResult] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[UsePaginationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: UsePaginationItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
