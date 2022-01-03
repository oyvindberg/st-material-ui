package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.`end-ellipsis`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`start-ellipsis`
import com.olvind.mui.muiMaterial.muiMaterialStrings.circular
import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.large
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.page
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.rounded
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialPaginationItemClasses] = js.native
  
  /**
    * The active color.
    * @default 'standard'
    */
  var color: js.UndefOr[standard | primary | secondary] = js.native
  
  /**
    * The components used for first, last, next & previous item type
    * @default {
    *   first: FirstPageIcon,
    *   last: LastPageIcon,
    *   next: NavigateNextIcon,
    *   previous: NavigateBeforeIcon,
    * }
    */
  var components: js.UndefOr[First] = js.native
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current page number.
    */
  var page: js.UndefOr[ReactElement] = js.native
  
  /**
    * If `true` the pagination item is selected.
    * @default false
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The shape of the pagination item.
    * @default 'circular'
    */
  var shape: js.UndefOr[circular | rounded] = js.native
  
  /**
    * The size of the component.
    * @default 'medium'
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The type of pagination item.
    * @default 'page'
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.native
  
  /**
    * The variant to use.
    * @default 'text'
    */
  var variant: js.UndefOr[text | outlined] = js.native
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: PartialPaginationItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: standard | primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponents(value: First): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setPage(value: ReactElement): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShape(value: circular | rounded): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariant(value: text | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
