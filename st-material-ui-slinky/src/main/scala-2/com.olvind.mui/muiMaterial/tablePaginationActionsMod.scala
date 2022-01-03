package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.PartialIconButtonPropsIconButtonTypeMapb
import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationActionsMod extends Shortcut {
  
  @JSImport("@mui/material/TablePagination/TablePaginationActions", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[TablePaginationActionsProps] = js.native
  
  @js.native
  trait TablePaginationActionsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var backIconButtonProps: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.native
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[js.Object] = js.native
    
    var count: Double = js.native
    
    /**
      * Accepts a function which returns a string value that provides a user-friendly name for the current page.
      * This is important for screen reader users.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
      * @returns {string}
      */
    def getItemAriaLabel(`type`: first | last | next | previous): String = js.native
    
    var nextIconButtonProps: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.native
    
    def onPageChange(event: Null, page: Double): Unit = js.native
    def onPageChange(event: SyntheticMouseEvent[HTMLButtonElement], page: Double): Unit = js.native
    
    var page: Double = js.native
    
    var rowsPerPage: Double = js.native
    
    var showFirstButton: Boolean = js.native
    
    var showLastButton: Boolean = js.native
  }
  
  type _To = JSXElementConstructor[TablePaginationActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `tablePaginationActionsMod.foo` */
  override def _to: JSXElementConstructor[TablePaginationActionsProps] = default
}
