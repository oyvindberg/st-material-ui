package com.olvind.mui.csstype.mod.Property

import com.olvind.mui.csstype.mod.DataType.AbsoluteSize
import com.olvind.mui.csstype.mod.DataType.AnimateableFeature
import com.olvind.mui.csstype.mod.DataType.Attachment
import com.olvind.mui.csstype.mod.DataType.BgPosition
import com.olvind.mui.csstype.mod.DataType.BgSize
import com.olvind.mui.csstype.mod.DataType.BlendMode
import com.olvind.mui.csstype.mod.DataType.Box
import com.olvind.mui.csstype.mod.DataType.CompositeStyle
import com.olvind.mui.csstype.mod.DataType.CompositingOperator
import com.olvind.mui.csstype.mod.DataType.ContentDistribution
import com.olvind.mui.csstype.mod.DataType.ContentList
import com.olvind.mui.csstype.mod.DataType.ContentPosition
import com.olvind.mui.csstype.mod.DataType.Dasharray
import com.olvind.mui.csstype.mod.DataType.DisplayInside
import com.olvind.mui.csstype.mod.DataType.DisplayInternal
import com.olvind.mui.csstype.mod.DataType.DisplayLegacy
import com.olvind.mui.csstype.mod.DataType.DisplayOutside
import com.olvind.mui.csstype.mod.DataType.EasingFunction
import com.olvind.mui.csstype.mod.DataType.EastAsianVariantValues
import com.olvind.mui.csstype.mod.DataType.FinalBgLayer
import com.olvind.mui.csstype.mod.DataType.FontStretchAbsolute
import com.olvind.mui.csstype.mod.DataType.FontWeightAbsolute
import com.olvind.mui.csstype.mod.DataType.GenericFamily
import com.olvind.mui.csstype.mod.DataType.GeometryBox
import com.olvind.mui.csstype.mod.DataType.GridLine
import com.olvind.mui.csstype.mod.DataType.LineStyle
import com.olvind.mui.csstype.mod.DataType.LineWidth
import com.olvind.mui.csstype.mod.DataType.MaskLayer
import com.olvind.mui.csstype.mod.DataType.MaskingMode
import com.olvind.mui.csstype.mod.DataType.Paint
import com.olvind.mui.csstype.mod.DataType.RepeatStyle
import com.olvind.mui.csstype.mod.DataType.SelfPosition
import com.olvind.mui.csstype.mod.DataType.SingleAnimation
import com.olvind.mui.csstype.mod.DataType.SingleAnimationDirection
import com.olvind.mui.csstype.mod.DataType.SingleAnimationFillMode
import com.olvind.mui.csstype.mod.DataType.SingleTransition
import com.olvind.mui.csstype.mod.DataType.TrackBreadth
import com.olvind.mui.csstype.mod.DataType.VisualBox
import com.olvind.mui.csstype.mod.Globals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccentColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "auto"

type AlignContent = Globals | ContentDistribution | ContentPosition | "baseline" | "normal" | String

type AlignItems = Globals | SelfPosition | "baseline" | "normal" | "stretch" | String

type AlignSelf = Globals | SelfPosition | "auto" | "baseline" | "normal" | "stretch" | String

type AlignTracks = Globals | ContentDistribution | ContentPosition | "baseline" | "normal" | String

type AlignmentBaseline = "after-edge" | "alphabetic" | "auto" | "baseline" | "before-edge" | "central" | "hanging" | "ideographic" | "mathematical" | "middle" | "text-after-edge" | "text-before-edge" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type All = Globals

type Animation[TTime] = Globals | SingleAnimation[TTime] | String

type AnimationDelay[TTime] = Globals | TTime | String

type AnimationDirection = Globals | SingleAnimationDirection | String

type AnimationDuration[TTime] = Globals | TTime | String

type AnimationFillMode = Globals | SingleAnimationFillMode | String

type AnimationIterationCount = Globals | "infinite" | String | Double

type AnimationName = Globals | "none" | String

type AnimationPlayState = Globals | "paused" | "running" | String

type AnimationTimingFunction = Globals | EasingFunction | String

type Appearance = "auto" | "menulist-button" | "none" | "textfield" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "button" | "checkbox" | "listbox" | "menulist" | "meter" | "progress-bar" | "push-button" | "radio" | "searchfield" | "slider-horizontal" | "square-button" | "textarea"

type AspectRatio = Globals | "auto" | String

type Azimuth = Globals | "behind" | "center" | "center-left" | "center-right" | "far-left" | "far-right" | "left" | "left-side" | "leftwards" | "right" | "right-side" | "rightwards" | String

type BackdropFilter = Globals | "none" | String

type BackfaceVisibility = "hidden" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Background[TLength] = Globals | FinalBgLayer[TLength] | String

type BackgroundAttachment = Globals | Attachment | String

type BackgroundBlendMode = Globals | BlendMode | String

type BackgroundClip = Globals | Box | String

type BackgroundColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BackgroundImage = Globals | "none" | String

type BackgroundOrigin = Globals | Box | String

type BackgroundPosition[TLength] = Globals | BgPosition[TLength] | String

type BackgroundPositionX[TLength] = Globals | TLength | "center" | "left" | "right" | "x-end" | "x-start" | String

type BackgroundPositionY[TLength] = Globals | TLength | "bottom" | "center" | "top" | "y-end" | "y-start" | String

type BackgroundRepeat = Globals | RepeatStyle | String

type BackgroundSize[TLength] = Globals | BgSize[TLength] | String

type BaselineShift[TLength] = Globals | TLength | "baseline" | "sub" | "super" | String

type BlockOverflow = Globals | "clip" | "ellipsis" | String

type BlockSize[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "auto" | "fit-content" | "max-content" | "min-content" | String

type Border[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBlock[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBlockColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBlockEnd[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBlockEndColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderBlockEndStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderBlockEndWidth[TLength] = Globals | LineWidth[TLength]

type BorderBlockStart[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBlockStartColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderBlockStartStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderBlockStartWidth[TLength] = Globals | LineWidth[TLength]

type BorderBlockStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderBlockWidth[TLength] = Globals | LineWidth[TLength]

type BorderBottom[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderBottomColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderBottomLeftRadius[TLength] = Globals | TLength | String

type BorderBottomRightRadius[TLength] = Globals | TLength | String

type BorderBottomStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderBottomWidth[TLength] = Globals | LineWidth[TLength]

type BorderCollapse = "collapse" | "separate" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BorderColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderEndEndRadius[TLength] = Globals | TLength | String

type BorderEndStartRadius[TLength] = Globals | TLength | String

type BorderImage = Globals | "none" | "repeat" | "round" | "space" | "stretch" | String | Double

type BorderImageOutset[TLength] = Globals | TLength | String | Double

type BorderImageRepeat = Globals | "repeat" | "round" | "space" | "stretch" | String

type BorderImageSlice = Globals | String | Double

type BorderImageSource = Globals | "none" | String

type BorderImageWidth[TLength] = Globals | TLength | "auto" | String | Double

type BorderInline[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderInlineColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderInlineEnd[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderInlineEndColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderInlineEndStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderInlineEndWidth[TLength] = Globals | LineWidth[TLength]

type BorderInlineStart[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderInlineStartColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderInlineStartStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderInlineStartWidth[TLength] = Globals | LineWidth[TLength]

type BorderInlineStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderInlineWidth[TLength] = Globals | LineWidth[TLength]

type BorderLeft[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderLeftColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderLeftStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderLeftWidth[TLength] = Globals | LineWidth[TLength]

type BorderRadius[TLength] = Globals | TLength | String

type BorderRight[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderRightColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderRightStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderRightWidth[TLength] = Globals | LineWidth[TLength]

type BorderSpacing[TLength] = Globals | TLength | String

type BorderStartEndRadius[TLength] = Globals | TLength | String

type BorderStartStartRadius[TLength] = Globals | TLength | String

type BorderStyle = Globals | LineStyle | String

type BorderTop[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type BorderTopColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type BorderTopLeftRadius[TLength] = Globals | TLength | String

type BorderTopRightRadius[TLength] = Globals | TLength | String

type BorderTopStyle = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"

type BorderTopWidth[TLength] = Globals | LineWidth[TLength]

type BorderWidth[TLength] = Globals | LineWidth[TLength] | String

type Bottom[TLength] = Globals | TLength | "auto" | String

type BoxAlign = "baseline" | "center" | "end" | "start" | "stretch" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BoxDecorationBreak = "clone" | "slice" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BoxDirection = "inherit" | "normal" | "reverse" | "-moz-initial" | "initial" | "revert" | "unset"

type BoxFlex = Globals | Double | String

type BoxFlexGroup = Globals | Double | String

type BoxLines = "multiple" | "single" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BoxOrdinalGroup = Globals | Double | String

type BoxOrient = "block-axis" | "horizontal" | "inherit" | "inline-axis" | "vertical" | "-moz-initial" | "initial" | "revert" | "unset"

type BoxPack = "center" | "end" | "justify" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BoxShadow = Globals | "none" | String

type BoxSizing = "border-box" | "content-box" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BreakAfter = "all" | "always" | "auto" | "avoid" | "avoid-column" | "avoid-page" | "avoid-region" | "column" | "left" | "page" | "recto" | "region" | "right" | "verso" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BreakBefore = "all" | "always" | "auto" | "avoid" | "avoid-column" | "avoid-page" | "avoid-region" | "column" | "left" | "page" | "recto" | "region" | "right" | "verso" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type BreakInside = "auto" | "avoid" | "avoid-column" | "avoid-page" | "avoid-region" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type CaptionSide = "block-end" | "block-start" | "bottom" | "inline-end" | "inline-start" | "top" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type CaretColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "auto"

type Clear = "both" | "inline-end" | "inline-start" | "left" | "none" | "right" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Clip = Globals | "auto" | String

type ClipPath = Globals | GeometryBox | "none" | String

type ClipRule = "evenodd" | "nonzero" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Color = Globals | com.olvind.mui.csstype.mod.DataType.Color

type ColorAdjust = "economy" | "exact" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ColorInterpolation = "auto" | "linearRGB" | "sRGB" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ColorRendering = "auto" | "optimizeQuality" | "optimizeSpeed" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ColorScheme = Globals | "dark" | "light" | "normal" | String

type ColumnCount = Globals | "auto" | Double | String

type ColumnFill = "auto" | "balance" | "balance-all" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ColumnGap[TLength] = Globals | TLength | "normal" | String

type ColumnRule[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type ColumnRuleColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type ColumnRuleStyle = Globals | LineStyle | String

type ColumnRuleWidth[TLength] = Globals | LineWidth[TLength] | String

type ColumnSpan = "all" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ColumnWidth[TLength] = Globals | TLength | "auto"

type Columns[TLength] = Globals | TLength | "auto" | String | Double

type Contain = Globals | "content" | "layout" | "none" | "paint" | "size" | "strict" | "style" | String

type Content = Globals | ContentList | "none" | "normal" | String

type ContentVisibility = "auto" | "hidden" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type CounterIncrement = Globals | "none" | String

type CounterReset = Globals | "none" | String

type CounterSet = Globals | "none" | String

type Cursor = Globals | "-moz-grab" | "-webkit-grab" | "alias" | "all-scroll" | "auto" | "cell" | "col-resize" | "context-menu" | "copy" | "crosshair" | "default" | "e-resize" | "ew-resize" | "grab" | "grabbing" | "help" | "move" | "n-resize" | "ne-resize" | "nesw-resize" | "no-drop" | "none" | "not-allowed" | "ns-resize" | "nw-resize" | "nwse-resize" | "pointer" | "progress" | "row-resize" | "s-resize" | "se-resize" | "sw-resize" | "text" | "vertical-text" | "w-resize" | "wait" | "zoom-in" | "zoom-out" | String

type Direction = "ltr" | "rtl" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Display = Globals | DisplayOutside | DisplayInside | DisplayInternal | DisplayLegacy | "contents" | "list-item" | "none" | String

type DominantBaseline = "alphabetic" | "auto" | "central" | "hanging" | "ideographic" | "mathematical" | "middle" | "no-change" | "reset-size" | "text-after-edge" | "text-before-edge" | "use-script" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type EmptyCells = "hide" | "show" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Fill = Globals | Paint

type FillOpacity = Globals | Double | String

type FillRule = "evenodd" | "nonzero" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Filter = Globals | "none" | String

type Flex[TLength] = Globals | TLength | "auto" | "content" | "fit-content" | "max-content" | "min-content" | "none" | String | Double

type FlexBasis[TLength] = Globals | TLength | "-moz-max-content" | "-moz-min-content" | "-webkit-auto" | "auto" | "content" | "fit-content" | "max-content" | "min-content" | String

type FlexDirection = "column" | "column-reverse" | "row" | "row-reverse" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FlexFlow = Globals | "column" | "column-reverse" | "nowrap" | "row" | "row-reverse" | "wrap" | "wrap-reverse" | String

type FlexGrow = Globals | Double | String

type FlexShrink = Globals | Double | String

type FlexWrap = "nowrap" | "wrap" | "wrap-reverse" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Float = "inline-end" | "inline-start" | "left" | "none" | "right" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FloodColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "currentColor"

type FloodOpacity = Globals | Double | String

type Font = Globals | "caption" | "icon" | "menu" | "message-box" | "small-caption" | "status-bar" | String

type FontFamily = Globals | GenericFamily | String

type FontFeatureSettings = Globals | "normal" | String

type FontKerning = "auto" | "none" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FontLanguageOverride = Globals | "normal" | String

type FontOpticalSizing = "auto" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FontSize[TLength] = Globals | AbsoluteSize | TLength | "larger" | "smaller" | String

type FontSizeAdjust = Globals | "from-font" | "none" | String | Double

type FontSmooth[TLength] = Globals | AbsoluteSize | TLength | "always" | "auto" | "never"

type FontStretch = Globals | FontStretchAbsolute

type FontStyle = Globals | "italic" | "normal" | "oblique" | String

type FontSynthesis = Globals | "none" | "small-caps" | "style" | "weight" | String

type FontVariant = Globals | EastAsianVariantValues | "all-petite-caps" | "all-small-caps" | "common-ligatures" | "contextual" | "diagonal-fractions" | "discretionary-ligatures" | "full-width" | "historical-forms" | "historical-ligatures" | "lining-nums" | "no-common-ligatures" | "no-contextual" | "no-discretionary-ligatures" | "no-historical-ligatures" | "none" | "normal" | "oldstyle-nums" | "ordinal" | "petite-caps" | "proportional-nums" | "proportional-width" | "ruby" | "slashed-zero" | "small-caps" | "stacked-fractions" | "tabular-nums" | "titling-caps" | "unicase" | String

type FontVariantAlternates = Globals | "historical-forms" | "normal" | String

type FontVariantCaps = "all-petite-caps" | "all-small-caps" | "normal" | "petite-caps" | "small-caps" | "titling-caps" | "unicase" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FontVariantEastAsian = Globals | EastAsianVariantValues | "full-width" | "normal" | "proportional-width" | "ruby" | String

type FontVariantLigatures = Globals | "common-ligatures" | "contextual" | "discretionary-ligatures" | "historical-ligatures" | "no-common-ligatures" | "no-contextual" | "no-discretionary-ligatures" | "no-historical-ligatures" | "none" | "normal" | String

type FontVariantNumeric = Globals | "diagonal-fractions" | "lining-nums" | "normal" | "oldstyle-nums" | "ordinal" | "proportional-nums" | "slashed-zero" | "stacked-fractions" | "tabular-nums" | String

type FontVariantPosition = "normal" | "sub" | "super" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type FontVariationSettings = Globals | "normal" | String

type FontWeight = Globals | FontWeightAbsolute | "bolder" | "lighter"

type ForcedColorAdjust = "auto" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Gap[TLength] = Globals | TLength | "normal" | String

type GlyphOrientationVertical = Globals | "auto" | String | Double

type Grid = Globals | "none" | String

type GridArea = Globals | GridLine | String

type GridAutoColumns[TLength] = Globals | TrackBreadth[TLength] | String

type GridAutoFlow = Globals | "column" | "dense" | "row" | String

type GridAutoRows[TLength] = Globals | TrackBreadth[TLength] | String

type GridColumn = Globals | GridLine | String

type GridColumnEnd = Globals | GridLine

type GridColumnGap[TLength] = Globals | TLength | String

type GridColumnStart = Globals | GridLine

type GridGap[TLength] = Globals | TLength | String

type GridRow = Globals | GridLine | String

type GridRowEnd = Globals | GridLine

type GridRowGap[TLength] = Globals | TLength | String

type GridRowStart = Globals | GridLine

type GridTemplate = Globals | "none" | String

type GridTemplateAreas = Globals | "none" | String

type GridTemplateColumns[TLength] = Globals | TrackBreadth[TLength] | "none" | "subgrid" | String

type GridTemplateRows[TLength] = Globals | TrackBreadth[TLength] | "none" | "subgrid" | String

type HangingPunctuation = Globals | "allow-end" | "first" | "force-end" | "last" | "none" | String

type Height[TLength] = Globals | TLength | "-moz-max-content" | "-moz-min-content" | "-webkit-fit-content" | "auto" | "fit-content" | "max-content" | "min-content" | String

type Hyphens = "auto" | "manual" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ImageOrientation = Globals | "flip" | "from-image" | String

type ImageRendering = "-moz-crisp-edges" | "-webkit-optimize-contrast" | "auto" | "crisp-edges" | "pixelated" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ImageResolution = Globals | "from-image" | String

type ImeMode = "active" | "auto" | "disabled" | "inactive" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type InitialLetter = Globals | "normal" | String | Double

type InlineSize[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "auto" | "fit-content" | "max-content" | "min-content" | String

type Inset[TLength] = Globals | TLength | "auto" | String

type InsetBlock[TLength] = Globals | TLength | "auto" | String

type InsetBlockEnd[TLength] = Globals | TLength | "auto" | String

type InsetBlockStart[TLength] = Globals | TLength | "auto" | String

type InsetInline[TLength] = Globals | TLength | "auto" | String

type InsetInlineEnd[TLength] = Globals | TLength | "auto" | String

type InsetInlineStart[TLength] = Globals | TLength | "auto" | String

type Isolation = "auto" | "isolate" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type JustifyContent = Globals | ContentDistribution | ContentPosition | "left" | "normal" | "right" | String

type JustifyItems = Globals | SelfPosition | "baseline" | "left" | "legacy" | "normal" | "right" | "stretch" | String

type JustifySelf = Globals | SelfPosition | "auto" | "baseline" | "left" | "normal" | "right" | "stretch" | String

type JustifyTracks = Globals | ContentDistribution | ContentPosition | "left" | "normal" | "right" | String

type Left[TLength] = Globals | TLength | "auto" | String

type LetterSpacing[TLength] = Globals | TLength | "normal"

type LightingColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "currentColor"

type LineBreak = "anywhere" | "auto" | "loose" | "normal" | "strict" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type LineClamp = Globals | "none" | Double | String

type LineHeight[TLength] = Globals | TLength | "normal" | String | Double

type LineHeightStep[TLength] = Globals | TLength

type ListStyle = Globals | "inside" | "none" | "outside" | String

type ListStyleImage = Globals | "none" | String

type ListStylePosition = "inside" | "outside" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ListStyleType = Globals | "none" | String

type Margin[TLength] = Globals | TLength | "auto" | String

type MarginBlock[TLength] = Globals | TLength | "auto" | String

type MarginBlockEnd[TLength] = Globals | TLength | "auto" | String

type MarginBlockStart[TLength] = Globals | TLength | "auto" | String

type MarginBottom[TLength] = Globals | TLength | "auto" | String

type MarginInline[TLength] = Globals | TLength | "auto" | String

type MarginInlineEnd[TLength] = Globals | TLength | "auto" | String

type MarginInlineStart[TLength] = Globals | TLength | "auto" | String

type MarginLeft[TLength] = Globals | TLength | "auto" | String

type MarginRight[TLength] = Globals | TLength | "auto" | String

type MarginTop[TLength] = Globals | TLength | "auto" | String

type Marker = Globals | "none" | String

type MarkerEnd = Globals | "none" | String

type MarkerMid = Globals | "none" | String

type MarkerStart = Globals | "none" | String

type Mask[TLength] = Globals | MaskLayer[TLength] | String

type MaskBorder = Globals | "alpha" | "luminance" | "none" | "repeat" | "round" | "space" | "stretch" | String | Double

type MaskBorderMode = "alpha" | "luminance" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MaskBorderOutset[TLength] = Globals | TLength | String | Double

type MaskBorderRepeat = Globals | "repeat" | "round" | "space" | "stretch" | String

type MaskBorderSlice = Globals | String | Double

type MaskBorderSource = Globals | "none" | String

type MaskBorderWidth[TLength] = Globals | TLength | "auto" | String | Double

type MaskClip = Globals | GeometryBox | "no-clip" | String

type MaskComposite = Globals | CompositingOperator | String

type MaskImage = Globals | "none" | String

type MaskMode = Globals | MaskingMode | String

type MaskOrigin = Globals | GeometryBox | String

type MaskPosition[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | String

type MaskRepeat = Globals | RepeatStyle | String

type MaskSize[TLength] = Globals | BgSize[TLength] | String

type MaskType = "alpha" | "luminance" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MathStyle = "compact" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MaxBlockSize[TLength] = Globals | TLength | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "fit-content" | "max-content" | "min-content" | "none" | String

type MaxHeight[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fit-content" | "-webkit-max-content" | "-webkit-min-content" | "fit-content" | "intrinsic" | "max-content" | "min-content" | "none" | String

type MaxInlineSize[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "fit-content" | "max-content" | "min-content" | "none" | String

type MaxLines = Globals | "none" | Double | String

type MaxWidth[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fit-content" | "-webkit-max-content" | "-webkit-min-content" | "fit-content" | "intrinsic" | "max-content" | "min-content" | "none" | String

type MinBlockSize[TLength] = Globals | TLength | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "auto" | "fit-content" | "max-content" | "min-content" | String

type MinHeight[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fit-content" | "-webkit-max-content" | "-webkit-min-content" | "auto" | "fit-content" | "intrinsic" | "max-content" | "min-content" | String

type MinInlineSize[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "auto" | "fit-content" | "max-content" | "min-content" | String

type MinWidth[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fill-available" | "-webkit-fit-content" | "-webkit-max-content" | "-webkit-min-content" | "auto" | "fit-content" | "intrinsic" | "max-content" | "min-content" | "min-intrinsic" | String

type MixBlendMode = "-moz-initial" | "inherit" | "initial" | "revert" | "unset" | "color" | "color-burn" | "color-dodge" | "darken" | "difference" | "exclusion" | "hard-light" | "hue" | "lighten" | "luminosity" | "multiply" | "normal" | "overlay" | "saturation" | "screen" | "soft-light"

type MozAppearance = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115, starting with "-moz-mac-unified-toolbar", "-moz-win-borderless-glass", "-moz-win-browsertabbar-toolbox" */ String

type MozBinding = Globals | "none" | String

type MozBorderBottomColors = Globals | com.olvind.mui.csstype.mod.DataType.Color | "none" | String

type MozBorderLeftColors = Globals | com.olvind.mui.csstype.mod.DataType.Color | "none" | String

type MozBorderRightColors = Globals | com.olvind.mui.csstype.mod.DataType.Color | "none" | String

type MozBorderTopColors = Globals | com.olvind.mui.csstype.mod.DataType.Color | "none" | String

type MozContextProperties = Globals | "fill" | "fill-opacity" | "none" | "stroke" | "stroke-opacity" | String

type MozFloatEdge = "border-box" | "content-box" | "margin-box" | "padding-box" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozForceBrokenImageIcon = Globals | 0 | String | 1

type MozImageRegion = Globals | "auto" | String

type MozOrient = "block" | "horizontal" | "inline" | "vertical" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozOutlineRadius[TLength] = Globals | TLength | String

type MozOutlineRadiusBottomleft[TLength] = Globals | TLength | String

type MozOutlineRadiusBottomright[TLength] = Globals | TLength | String

type MozOutlineRadiusTopleft[TLength] = Globals | TLength | String

type MozOutlineRadiusTopright[TLength] = Globals | TLength | String

type MozStackSizing = "ignore" | "stretch-to-fit" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozTextBlink = "blink" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozUserFocus = "ignore" | "none" | "normal" | "select-after" | "select-all" | "select-before" | "select-menu" | "select-same" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozUserInput = "auto" | "disabled" | "enabled" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozUserModify = "read-only" | "read-write" | "write-only" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozWindowDragging = "drag" | "no-drag" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MozWindowShadow = "default" | "menu" | "none" | "sheet" | "tooltip" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsAccelerator = "false" | "true" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsBlockProgression = "bt" | "lr" | "rl" | "tb" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsContentZoomChaining = "chained" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsContentZoomLimit = Globals | String

type MsContentZoomLimitMax = Globals | String

type MsContentZoomLimitMin = Globals | String

type MsContentZoomSnap = Globals | "mandatory" | "none" | "proximity" | String

type MsContentZoomSnapPoints = Globals | String

type MsContentZoomSnapType = "mandatory" | "none" | "proximity" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsContentZooming = "none" | "zoom" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsFilter = Globals | String

type MsFlowFrom = Globals | "none" | String

type MsFlowInto = Globals | "none" | String

type MsGridColumns[TLength] = Globals | TrackBreadth[TLength] | "none" | String

type MsGridRows[TLength] = Globals | TrackBreadth[TLength] | "none" | String

type MsHighContrastAdjust = "auto" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsHyphenateLimitChars = Globals | "auto" | String | Double

type MsHyphenateLimitLines = Globals | "no-limit" | Double | String

type MsHyphenateLimitZone[TLength] = Globals | TLength | String

type MsImeAlign = "after" | "auto" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsOverflowStyle = "-ms-autohiding-scrollbar" | "auto" | "none" | "scrollbar" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsScrollChaining = "chained" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsScrollLimit = Globals | String

type MsScrollLimitXMax[TLength] = Globals | TLength | "auto"

type MsScrollLimitXMin[TLength] = Globals | TLength

type MsScrollLimitYMax[TLength] = Globals | TLength | "auto"

type MsScrollLimitYMin[TLength] = Globals | TLength

type MsScrollRails = "none" | "railed" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsScrollSnapPointsX = Globals | String

type MsScrollSnapPointsY = Globals | String

type MsScrollSnapType = "mandatory" | "none" | "proximity" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsScrollSnapX = Globals | String

type MsScrollSnapY = Globals | String

type MsScrollTranslation = "none" | "vertical-to-horizontal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsScrollbar3dlightColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarArrowColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarBaseColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarDarkshadowColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarFaceColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarHighlightColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarShadowColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsScrollbarTrackColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type MsTextAutospace = "ideograph-alpha" | "ideograph-numeric" | "ideograph-parenthesis" | "ideograph-space" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsTouchSelect = "grippers" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsUserSelect = "element" | "none" | "text" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsWrapFlow = "auto" | "both" | "clear" | "end" | "maximum" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type MsWrapMargin[TLength] = Globals | TLength

type MsWrapThrough = "none" | "wrap" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ObjectFit = "contain" | "cover" | "fill" | "none" | "scale-down" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ObjectPosition[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength]

type Offset[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | GeometryBox | "auto" | "none" | String

type OffsetAnchor[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | "auto"

type OffsetDistance[TLength] = Globals | TLength | String

type OffsetPath = Globals | GeometryBox | "none" | String

type OffsetRotate = Globals | "auto" | "reverse" | String

type Opacity = Globals | String | Double

type Order = Globals | Double | String

type Orphans = Globals | Double | String

type Outline[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Color | LineStyle | LineWidth[TLength] | "auto" | "invert" | String

type OutlineColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "invert"

type OutlineOffset[TLength] = Globals | TLength

type OutlineStyle = Globals | LineStyle | "auto" | String

type OutlineWidth[TLength] = Globals | LineWidth[TLength]

type Overflow = Globals | "-moz-hidden-unscrollable" | "auto" | "clip" | "hidden" | "scroll" | "visible" | String

type OverflowAnchor = "auto" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowBlock = "auto" | "clip" | "hidden" | "scroll" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowClipBox = "content-box" | "padding-box" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowClipMargin[TLength] = Globals | VisualBox | TLength | String

type OverflowInline = "auto" | "clip" | "hidden" | "scroll" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowWrap = "anywhere" | "break-word" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowX = "-moz-hidden-unscrollable" | "auto" | "clip" | "hidden" | "scroll" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverflowY = "-moz-hidden-unscrollable" | "auto" | "clip" | "hidden" | "scroll" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverscrollBehavior = Globals | "auto" | "contain" | "none" | String

type OverscrollBehaviorBlock = "auto" | "contain" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverscrollBehaviorInline = "auto" | "contain" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverscrollBehaviorX = "auto" | "contain" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type OverscrollBehaviorY = "auto" | "contain" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Padding[TLength] = Globals | TLength | String

type PaddingBlock[TLength] = Globals | TLength | String

type PaddingBlockEnd[TLength] = Globals | TLength | String

type PaddingBlockStart[TLength] = Globals | TLength | String

type PaddingBottom[TLength] = Globals | TLength | String

type PaddingInline[TLength] = Globals | TLength | String

type PaddingInlineEnd[TLength] = Globals | TLength | String

type PaddingInlineStart[TLength] = Globals | TLength | String

type PaddingLeft[TLength] = Globals | TLength | String

type PaddingRight[TLength] = Globals | TLength | String

type PaddingTop[TLength] = Globals | TLength | String

type PageBreakAfter = "always" | "auto" | "avoid" | "left" | "recto" | "right" | "verso" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type PageBreakBefore = "always" | "auto" | "avoid" | "left" | "recto" | "right" | "verso" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type PageBreakInside = "auto" | "avoid" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type PaintOrder = Globals | "fill" | "markers" | "normal" | "stroke" | String

type Perspective[TLength] = Globals | TLength | "none"

type PerspectiveOrigin[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength]

type PlaceContent = Globals | ContentDistribution | ContentPosition | "baseline" | "normal" | String

type PlaceItems = Globals | SelfPosition | "baseline" | "normal" | "stretch" | String

type PlaceSelf = Globals | SelfPosition | "auto" | "baseline" | "normal" | "stretch" | String

type PointerEvents = "all" | "auto" | "fill" | "inherit" | "none" | "painted" | "stroke" | "visible" | "visibleFill" | "visiblePainted" | "visibleStroke" | "-moz-initial" | "initial" | "revert" | "unset"

type Position = "-webkit-sticky" | "absolute" | "fixed" | "relative" | "static" | "sticky" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Quotes = Globals | "auto" | "none" | String

type Resize = "block" | "both" | "horizontal" | "inline" | "none" | "vertical" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Right[TLength] = Globals | TLength | "auto" | String

type Rotate = Globals | "none" | String

type RowGap[TLength] = Globals | TLength | "normal" | String

type RubyAlign = "center" | "space-around" | "space-between" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type RubyMerge = "auto" | "collapse" | "separate" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type RubyPosition = Globals | "alternate" | "inter-character" | "over" | "under" | String

type Scale = Globals | "none" | String | Double

type ScrollBehavior = "auto" | "smooth" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ScrollMargin[TLength] = Globals | TLength | String

type ScrollMarginBlock[TLength] = Globals | TLength | String

type ScrollMarginBlockEnd[TLength] = Globals | TLength

type ScrollMarginBlockStart[TLength] = Globals | TLength

type ScrollMarginBottom[TLength] = Globals | TLength

type ScrollMarginInline[TLength] = Globals | TLength | String

type ScrollMarginInlineEnd[TLength] = Globals | TLength

type ScrollMarginInlineStart[TLength] = Globals | TLength

type ScrollMarginLeft[TLength] = Globals | TLength

type ScrollMarginRight[TLength] = Globals | TLength

type ScrollMarginTop[TLength] = Globals | TLength

type ScrollPadding[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingBlock[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingBlockEnd[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingBlockStart[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingBottom[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingInline[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingInlineEnd[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingInlineStart[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingLeft[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingRight[TLength] = Globals | TLength | "auto" | String

type ScrollPaddingTop[TLength] = Globals | TLength | "auto" | String

type ScrollSnapAlign = Globals | "center" | "end" | "none" | "start" | String

type ScrollSnapCoordinate[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | "none" | String

type ScrollSnapDestination[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength]

type ScrollSnapPointsX = Globals | "none" | String

type ScrollSnapPointsY = Globals | "none" | String

type ScrollSnapStop = "always" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ScrollSnapType = Globals | "block" | "both" | "inline" | "none" | "x" | "y" | String

type ScrollSnapTypeX = "mandatory" | "none" | "proximity" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ScrollSnapTypeY = "mandatory" | "none" | "proximity" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ScrollbarColor = Globals | "auto" | String

type ScrollbarGutter = Globals | "auto" | "stable" | String

type ScrollbarWidth = "auto" | "none" | "thin" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ShapeImageThreshold = Globals | String | Double

type ShapeMargin[TLength] = Globals | TLength | String

type ShapeOutside = Globals | Box | "margin-box" | "none" | String

type ShapeRendering = "auto" | "crispEdges" | "geometricPrecision" | "optimizeSpeed" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type StopColor = Globals | com.olvind.mui.csstype.mod.DataType.Color | "currentColor"

type StopOpacity = Globals | Double | String

type Stroke = Globals | Paint

type StrokeDasharray[TLength] = Globals | Dasharray[TLength] | "none"

type StrokeDashoffset[TLength] = Globals | TLength | String

type StrokeLinecap = "butt" | "round" | "square" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type StrokeLinejoin = "bevel" | "miter" | "round" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type StrokeMiterlimit = Globals | Double | String

type StrokeOpacity = Globals | Double | String

type StrokeWidth[TLength] = Globals | TLength | String

type TabSize[TLength] = Globals | TLength | Double | String

type TableLayout = "auto" | "fixed" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextAlign = "center" | "end" | "justify" | "left" | "match-parent" | "right" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextAlignLast = "auto" | "center" | "end" | "justify" | "left" | "right" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextAnchor = "end" | "middle" | "start" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextCombineUpright = Globals | "all" | "none" | String

type TextDecoration[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Color | TLength | "auto" | "blink" | "dashed" | "dotted" | "double" | "from-font" | "grammar-error" | "line-through" | "none" | "overline" | "solid" | "spelling-error" | "underline" | "wavy" | String

type TextDecorationColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type TextDecorationLine = Globals | "blink" | "grammar-error" | "line-through" | "none" | "overline" | "spelling-error" | "underline" | String

type TextDecorationSkip = Globals | "box-decoration" | "edges" | "leading-spaces" | "none" | "objects" | "spaces" | "trailing-spaces" | String

type TextDecorationSkipInk = "all" | "auto" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextDecorationStyle = "dashed" | "dotted" | "double" | "solid" | "wavy" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextDecorationThickness[TLength] = Globals | TLength | "auto" | "from-font" | String

type TextEmphasis = Globals | com.olvind.mui.csstype.mod.DataType.Color | "circle" | "dot" | "double-circle" | "filled" | "none" | "open" | "sesame" | "triangle" | String

type TextEmphasisColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type TextEmphasisPosition = Globals | String

type TextEmphasisStyle = Globals | "circle" | "dot" | "double-circle" | "filled" | "none" | "open" | "sesame" | "triangle" | String

type TextIndent[TLength] = Globals | TLength | String

type TextJustify = "auto" | "inter-character" | "inter-word" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextOrientation = "mixed" | "sideways" | "upright" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextOverflow = Globals | "clip" | "ellipsis" | String

type TextRendering = "auto" | "geometricPrecision" | "optimizeLegibility" | "optimizeSpeed" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextShadow = Globals | "none" | String

type TextSizeAdjust = Globals | "auto" | "none" | String

type TextTransform = "capitalize" | "full-size-kana" | "full-width" | "lowercase" | "none" | "uppercase" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TextUnderlineOffset[TLength] = Globals | TLength | "auto" | String

type TextUnderlinePosition = Globals | "auto" | "from-font" | "left" | "right" | "under" | String

type Top[TLength] = Globals | TLength | "auto" | String

type TouchAction = Globals | "-ms-manipulation" | "-ms-none" | "-ms-pinch-zoom" | "auto" | "manipulation" | "none" | "pan-down" | "pan-left" | "pan-right" | "pan-up" | "pan-x" | "pan-y" | "pinch-zoom" | String

type Transform = Globals | "none" | String

type TransformBox = "border-box" | "content-box" | "fill-box" | "stroke-box" | "view-box" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type TransformOrigin[TLength] = Globals | TLength | "bottom" | "center" | "left" | "right" | "top" | String

type TransformStyle = "flat" | "preserve-3d" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Transition[TTime] = Globals | SingleTransition[TTime] | String

type TransitionDelay[TTime] = Globals | TTime | String

type TransitionDuration[TTime] = Globals | TTime | String

type TransitionProperty = Globals | "all" | "none" | String

type TransitionTimingFunction = Globals | EasingFunction | String

type Translate[TLength] = Globals | TLength | "none" | String

type UnicodeBidi = "-moz-isolate" | "-moz-isolate-override" | "-moz-plaintext" | "-webkit-isolate" | "-webkit-isolate-override" | "-webkit-plaintext" | "bidi-override" | "embed" | "isolate" | "isolate-override" | "normal" | "plaintext" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type UserSelect = "-moz-none" | "all" | "auto" | "contain" | "element" | "none" | "text" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type VectorEffect = "non-scaling-stroke" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type VerticalAlign[TLength] = Globals | TLength | "baseline" | "bottom" | "middle" | "sub" | "super" | "text-bottom" | "text-top" | "top" | String

type Visibility = "collapse" | "hidden" | "visible" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WebkitAppearance = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54, starting with "-apple-pay-button", "button", "button-bevel" */ String

type WebkitBorderBefore[TLength] = Globals | LineWidth[TLength] | LineStyle | com.olvind.mui.csstype.mod.DataType.Color | String

type WebkitBorderBeforeColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type WebkitBorderBeforeStyle = Globals | LineStyle | String

type WebkitBorderBeforeWidth[TLength] = Globals | LineWidth[TLength] | String

type WebkitBoxReflect[TLength] = Globals | TLength | "above" | "below" | "left" | "right" | String

type WebkitLineClamp = Globals | "none" | Double | String

type WebkitMask[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | RepeatStyle | Box | "border" | "content" | "none" | "padding" | "text" | String

type WebkitMaskAttachment = Globals | Attachment | String

type WebkitMaskClip = Globals | Box | "border" | "content" | "padding" | "text" | String

type WebkitMaskComposite = Globals | CompositeStyle | String

type WebkitMaskImage = Globals | "none" | String

type WebkitMaskOrigin = Globals | Box | "border" | "content" | "padding" | String

type WebkitMaskPosition[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Position[TLength] | String

type WebkitMaskPositionX[TLength] = Globals | TLength | "center" | "left" | "right" | String

type WebkitMaskPositionY[TLength] = Globals | TLength | "bottom" | "center" | "top" | String

type WebkitMaskRepeat = Globals | RepeatStyle | String

type WebkitMaskRepeatX = "no-repeat" | "repeat" | "round" | "space" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WebkitMaskRepeatY = "no-repeat" | "repeat" | "round" | "space" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WebkitMaskSize[TLength] = Globals | BgSize[TLength] | String

type WebkitOverflowScrolling = "auto" | "touch" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WebkitTapHighlightColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type WebkitTextFillColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type WebkitTextStroke[TLength] = Globals | com.olvind.mui.csstype.mod.DataType.Color | TLength | String

type WebkitTextStrokeColor = Globals | com.olvind.mui.csstype.mod.DataType.Color

type WebkitTextStrokeWidth[TLength] = Globals | TLength

type WebkitTouchCallout = "default" | "none" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WebkitUserModify = "read-only" | "read-write" | "read-write-plaintext-only" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WhiteSpace = "-moz-pre-wrap" | "break-spaces" | "normal" | "nowrap" | "pre" | "pre-line" | "pre-wrap" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type Widows = Globals | Double | String

type Width[TLength] = Globals | TLength | "-moz-fit-content" | "-moz-max-content" | "-moz-min-content" | "-webkit-fit-content" | "-webkit-max-content" | "auto" | "fit-content" | "intrinsic" | "max-content" | "min-content" | "min-intrinsic" | String

type WillChange = Globals | AnimateableFeature | "auto" | String

type WordBreak = "break-all" | "break-word" | "keep-all" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WordSpacing[TLength] = Globals | TLength | "normal"

type WordWrap = "break-word" | "normal" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type WritingMode = "horizontal-tb" | "sideways-lr" | "sideways-rl" | "vertical-lr" | "vertical-rl" | "-moz-initial" | "inherit" | "initial" | "revert" | "unset"

type ZIndex = Globals | "auto" | Double | String

type Zoom = Globals | "normal" | "reset" | String | Double
