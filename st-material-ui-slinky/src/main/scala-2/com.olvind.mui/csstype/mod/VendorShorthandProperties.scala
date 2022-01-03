package com.olvind.mui.csstype.mod

import com.olvind.mui.csstype.mod.Property.Animation
import com.olvind.mui.csstype.mod.Property.BorderImage
import com.olvind.mui.csstype.mod.Property.BorderRadius
import com.olvind.mui.csstype.mod.Property.ColumnRule
import com.olvind.mui.csstype.mod.Property.Columns
import com.olvind.mui.csstype.mod.Property.Flex
import com.olvind.mui.csstype.mod.Property.FlexFlow
import com.olvind.mui.csstype.mod.Property.MaskBorder
import com.olvind.mui.csstype.mod.Property.MsContentZoomLimit
import com.olvind.mui.csstype.mod.Property.MsContentZoomSnap
import com.olvind.mui.csstype.mod.Property.MsScrollLimit
import com.olvind.mui.csstype.mod.Property.MsScrollSnapX
import com.olvind.mui.csstype.mod.Property.MsScrollSnapY
import com.olvind.mui.csstype.mod.Property.TextEmphasis
import com.olvind.mui.csstype.mod.Property.Transition
import com.olvind.mui.csstype.mod.Property.WebkitBorderBefore
import com.olvind.mui.csstype.mod.Property.WebkitMask
import com.olvind.mui.csstype.mod.Property.WebkitTextStroke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorShorthandProperties[TLength, TTime] extends StObject {
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var MozAnimation: js.UndefOr[Animation[TTime]] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var MozBorderImage: js.UndefOr[BorderImage] = js.native
  
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var MozColumnRule: js.UndefOr[ColumnRule[TLength]] = js.native
  
  /**
    * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var MozColumns: js.UndefOr[Columns[TLength]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var MozTransition: js.UndefOr[Transition[TTime]] = js.native
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var WebkitAnimation: js.UndefOr[Animation[TTime]] = js.native
  
  /**
    * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-width'> || <'border-style'> || <color>`
    */
  var WebkitBorderBefore: js.UndefOr[com.olvind.mui.csstype.mod.Property.WebkitBorderBefore[TLength]] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var WebkitBorderImage: js.UndefOr[BorderImage] = js.native
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    */
  var WebkitBorderRadius: js.UndefOr[BorderRadius[TLength]] = js.native
  
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var WebkitColumnRule: js.UndefOr[ColumnRule[TLength]] = js.native
  
  /**
    * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var WebkitColumns: js.UndefOr[Columns[TLength]] = js.native
  
  /**
    * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var WebkitFlex: js.UndefOr[Flex[TLength]] = js.native
  
  /**
    * The **`flex-flow`** CSS shorthand property specifies the direction of a flex container, as well as its wrapping behavior.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    */
  var WebkitFlexFlow: js.UndefOr[FlexFlow] = js.native
  
  /**
    * The **`mask`** CSS shorthand property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
    */
  var WebkitMask: js.UndefOr[com.olvind.mui.csstype.mod.Property.WebkitMask[TLength]] = js.native
  
  /**
    * The **`mask-border`** CSS shorthand property lets you create a mask along the edge of an element's border.
    *
    * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
    */
  var WebkitMaskBoxImage: js.UndefOr[MaskBorder] = js.native
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    */
  var WebkitTextEmphasis: js.UndefOr[TextEmphasis] = js.native
  
  /**
    * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
    *
    * **Syntax**: `<length> || <color>`
    */
  var WebkitTextStroke: js.UndefOr[com.olvind.mui.csstype.mod.Property.WebkitTextStroke[TLength]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var WebkitTransition: js.UndefOr[Transition[TTime]] = js.native
  
  /**
    * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
    */
  var msContentZoomLimit: js.UndefOr[MsContentZoomLimit] = js.native
  
  /**
    * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
    */
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnap] = js.native
  
  /**
    * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var msFlex: js.UndefOr[Flex[TLength]] = js.native
  
  /**
    * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
    *
    * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
    */
  var msScrollLimit: js.UndefOr[MsScrollLimit] = js.native
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
    */
  var msScrollSnapX: js.UndefOr[MsScrollSnapX] = js.native
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
    */
  var msScrollSnapY: js.UndefOr[MsScrollSnapY] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var msTransition: js.UndefOr[Transition[TTime]] = js.native
}
object VendorShorthandProperties {
  
  @scala.inline
  def apply[TLength, TTime](): VendorShorthandProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandProperties[TLength, TTime]]
  }
  
  @scala.inline
  implicit class VendorShorthandPropertiesMutableBuilder[Self <: VendorShorthandProperties[_, _], TLength, TTime] (val x: Self with (VendorShorthandProperties[TLength, TTime])) extends AnyVal {
    
    @scala.inline
    def setMozAnimation(value: Animation[TTime]): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
    
    @scala.inline
    def setMozBorderImage(value: BorderImage): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
    
    @scala.inline
    def setMozColumnRule(value: ColumnRule[TLength]): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
    
    @scala.inline
    def setMozColumns(value: Columns[TLength]): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
    
    @scala.inline
    def setMozTransition(value: Transition[TTime]): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimit(value: MsContentZoomLimit): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnap(value: MsContentZoomSnap): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
    
    @scala.inline
    def setMsFlex(value: Flex[TLength]): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
    
    @scala.inline
    def setMsScrollLimit(value: MsScrollLimit): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
    
    @scala.inline
    def setMsScrollSnapX(value: MsScrollSnapX): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
    
    @scala.inline
    def setMsScrollSnapY(value: MsScrollSnapY): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
    
    @scala.inline
    def setMsTransition(value: Transition[TTime]): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
    
    @scala.inline
    def setWebkitAnimation(value: Animation[TTime]): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
    
    @scala.inline
    def setWebkitBorderBefore(value: WebkitBorderBefore[TLength]): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
    
    @scala.inline
    def setWebkitBorderImage(value: BorderImage): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
    
    @scala.inline
    def setWebkitBorderRadius(value: BorderRadius[TLength]): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
    
    @scala.inline
    def setWebkitColumnRule(value: ColumnRule[TLength]): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
    
    @scala.inline
    def setWebkitColumns(value: Columns[TLength]): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
    
    @scala.inline
    def setWebkitFlex(value: Flex[TLength]): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexFlow(value: FlexFlow): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
    
    @scala.inline
    def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
    
    @scala.inline
    def setWebkitMask(value: WebkitMask[TLength]): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskBoxImage(value: MaskBorder): Self = StObject.set(x, "WebkitMaskBoxImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "WebkitMaskBoxImage", js.undefined)
    
    @scala.inline
    def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasis(value: TextEmphasis): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
    
    @scala.inline
    def setWebkitTextStroke(value: WebkitTextStroke[TLength]): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
    
    @scala.inline
    def setWebkitTransition(value: Transition[TTime]): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
  }
}
