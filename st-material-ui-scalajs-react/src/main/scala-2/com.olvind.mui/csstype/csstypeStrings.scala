package com.olvind.mui.csstype

import com.olvind.mui.csstype.mod.AtRule.FontDisplay
import com.olvind.mui.csstype.mod.AtRule.Inherits
import com.olvind.mui.csstype.mod.AtRule.Orientation
import com.olvind.mui.csstype.mod.AtRule.UserZoom
import com.olvind.mui.csstype.mod.AtRule.ViewportFit
import com.olvind.mui.csstype.mod.AtRule._Marks
import com.olvind.mui.csstype.mod.AtRule._Size
import com.olvind.mui.csstype.mod.AtRule._SpeakAs
import com.olvind.mui.csstype.mod.AtRule._System
import com.olvind.mui.csstype.mod.DataType.AbsoluteSize
import com.olvind.mui.csstype.mod.DataType.Attachment
import com.olvind.mui.csstype.mod.DataType.BlendMode
import com.olvind.mui.csstype.mod.DataType.Box
import com.olvind.mui.csstype.mod.DataType.CompatAuto
import com.olvind.mui.csstype.mod.DataType.CompositeStyle
import com.olvind.mui.csstype.mod.DataType.CompositingOperator
import com.olvind.mui.csstype.mod.DataType.ContentDistribution
import com.olvind.mui.csstype.mod.DataType.ContentPosition
import com.olvind.mui.csstype.mod.DataType.DeprecatedSystemColor
import com.olvind.mui.csstype.mod.DataType.DisplayInside
import com.olvind.mui.csstype.mod.DataType.DisplayInternal
import com.olvind.mui.csstype.mod.DataType.DisplayLegacy
import com.olvind.mui.csstype.mod.DataType.DisplayOutside
import com.olvind.mui.csstype.mod.DataType.EastAsianVariantValues
import com.olvind.mui.csstype.mod.DataType.GenericFamily
import com.olvind.mui.csstype.mod.DataType.GeometryBox
import com.olvind.mui.csstype.mod.DataType.LineStyle
import com.olvind.mui.csstype.mod.DataType.MaskingMode
import com.olvind.mui.csstype.mod.DataType.NamedColor
import com.olvind.mui.csstype.mod.DataType.PageSize
import com.olvind.mui.csstype.mod.DataType.Quote
import com.olvind.mui.csstype.mod.DataType.SelfPosition
import com.olvind.mui.csstype.mod.DataType.SingleAnimationDirection
import com.olvind.mui.csstype.mod.DataType.SingleAnimationFillMode
import com.olvind.mui.csstype.mod.DataType.VisualBox
import com.olvind.mui.csstype.mod.DataType._AnimateableFeature
import com.olvind.mui.csstype.mod.DataType._BgPosition
import com.olvind.mui.csstype.mod.DataType._BgSize
import com.olvind.mui.csstype.mod.DataType._Color
import com.olvind.mui.csstype.mod.DataType._ContentList
import com.olvind.mui.csstype.mod.DataType._CubicBezierTimingFunction
import com.olvind.mui.csstype.mod.DataType._EasingFunction
import com.olvind.mui.csstype.mod.DataType._FinalBgLayer
import com.olvind.mui.csstype.mod.DataType._FontStretchAbsolute
import com.olvind.mui.csstype.mod.DataType._FontWeightAbsolute
import com.olvind.mui.csstype.mod.DataType._LineWidth
import com.olvind.mui.csstype.mod.DataType._MaskLayer
import com.olvind.mui.csstype.mod.DataType._Paint
import com.olvind.mui.csstype.mod.DataType._Position
import com.olvind.mui.csstype.mod.DataType._RepeatStyle
import com.olvind.mui.csstype.mod.DataType._SingleAnimation
import com.olvind.mui.csstype.mod.DataType._SingleTransition
import com.olvind.mui.csstype.mod.DataType._StepTimingFunction
import com.olvind.mui.csstype.mod.DataType._TrackBreadth
import com.olvind.mui.csstype.mod.Globals
import com.olvind.mui.csstype.mod.Property.AlignmentBaseline
import com.olvind.mui.csstype.mod.Property.Appearance
import com.olvind.mui.csstype.mod.Property.BackfaceVisibility
import com.olvind.mui.csstype.mod.Property.BorderBlockEndStyle
import com.olvind.mui.csstype.mod.Property.BorderBlockStartStyle
import com.olvind.mui.csstype.mod.Property.BorderBlockStyle
import com.olvind.mui.csstype.mod.Property.BorderBottomStyle
import com.olvind.mui.csstype.mod.Property.BorderCollapse
import com.olvind.mui.csstype.mod.Property.BorderInlineEndStyle
import com.olvind.mui.csstype.mod.Property.BorderInlineStartStyle
import com.olvind.mui.csstype.mod.Property.BorderInlineStyle
import com.olvind.mui.csstype.mod.Property.BorderLeftStyle
import com.olvind.mui.csstype.mod.Property.BorderRightStyle
import com.olvind.mui.csstype.mod.Property.BorderTopStyle
import com.olvind.mui.csstype.mod.Property.BoxAlign
import com.olvind.mui.csstype.mod.Property.BoxDecorationBreak
import com.olvind.mui.csstype.mod.Property.BoxDirection
import com.olvind.mui.csstype.mod.Property.BoxLines
import com.olvind.mui.csstype.mod.Property.BoxOrient
import com.olvind.mui.csstype.mod.Property.BoxPack
import com.olvind.mui.csstype.mod.Property.BoxSizing
import com.olvind.mui.csstype.mod.Property.BreakAfter
import com.olvind.mui.csstype.mod.Property.BreakBefore
import com.olvind.mui.csstype.mod.Property.BreakInside
import com.olvind.mui.csstype.mod.Property.CaptionSide
import com.olvind.mui.csstype.mod.Property.Clear
import com.olvind.mui.csstype.mod.Property.ClipRule
import com.olvind.mui.csstype.mod.Property.ColorAdjust
import com.olvind.mui.csstype.mod.Property.ColorInterpolation
import com.olvind.mui.csstype.mod.Property.ColorRendering
import com.olvind.mui.csstype.mod.Property.ColumnFill
import com.olvind.mui.csstype.mod.Property.ColumnSpan
import com.olvind.mui.csstype.mod.Property.ContentVisibility
import com.olvind.mui.csstype.mod.Property.Direction
import com.olvind.mui.csstype.mod.Property.DominantBaseline
import com.olvind.mui.csstype.mod.Property.EmptyCells
import com.olvind.mui.csstype.mod.Property.FillRule
import com.olvind.mui.csstype.mod.Property.FlexDirection
import com.olvind.mui.csstype.mod.Property.FlexWrap
import com.olvind.mui.csstype.mod.Property.Float
import com.olvind.mui.csstype.mod.Property.FontKerning
import com.olvind.mui.csstype.mod.Property.FontOpticalSizing
import com.olvind.mui.csstype.mod.Property.FontVariantCaps
import com.olvind.mui.csstype.mod.Property.FontVariantPosition
import com.olvind.mui.csstype.mod.Property.ForcedColorAdjust
import com.olvind.mui.csstype.mod.Property.Hyphens
import com.olvind.mui.csstype.mod.Property.ImageRendering
import com.olvind.mui.csstype.mod.Property.ImeMode
import com.olvind.mui.csstype.mod.Property.Isolation
import com.olvind.mui.csstype.mod.Property.LineBreak
import com.olvind.mui.csstype.mod.Property.ListStylePosition
import com.olvind.mui.csstype.mod.Property.MaskBorderMode
import com.olvind.mui.csstype.mod.Property.MaskType
import com.olvind.mui.csstype.mod.Property.MathStyle
import com.olvind.mui.csstype.mod.Property.MixBlendMode
import com.olvind.mui.csstype.mod.Property.MozAppearance
import com.olvind.mui.csstype.mod.Property.MozFloatEdge
import com.olvind.mui.csstype.mod.Property.MozOrient
import com.olvind.mui.csstype.mod.Property.MozStackSizing
import com.olvind.mui.csstype.mod.Property.MozTextBlink
import com.olvind.mui.csstype.mod.Property.MozUserFocus
import com.olvind.mui.csstype.mod.Property.MozUserInput
import com.olvind.mui.csstype.mod.Property.MozUserModify
import com.olvind.mui.csstype.mod.Property.MozWindowDragging
import com.olvind.mui.csstype.mod.Property.MozWindowShadow
import com.olvind.mui.csstype.mod.Property.MsAccelerator
import com.olvind.mui.csstype.mod.Property.MsBlockProgression
import com.olvind.mui.csstype.mod.Property.MsContentZoomChaining
import com.olvind.mui.csstype.mod.Property.MsContentZoomSnapType
import com.olvind.mui.csstype.mod.Property.MsContentZooming
import com.olvind.mui.csstype.mod.Property.MsHighContrastAdjust
import com.olvind.mui.csstype.mod.Property.MsImeAlign
import com.olvind.mui.csstype.mod.Property.MsOverflowStyle
import com.olvind.mui.csstype.mod.Property.MsScrollChaining
import com.olvind.mui.csstype.mod.Property.MsScrollRails
import com.olvind.mui.csstype.mod.Property.MsScrollSnapType
import com.olvind.mui.csstype.mod.Property.MsScrollTranslation
import com.olvind.mui.csstype.mod.Property.MsTextAutospace
import com.olvind.mui.csstype.mod.Property.MsTouchSelect
import com.olvind.mui.csstype.mod.Property.MsUserSelect
import com.olvind.mui.csstype.mod.Property.MsWrapFlow
import com.olvind.mui.csstype.mod.Property.MsWrapThrough
import com.olvind.mui.csstype.mod.Property.ObjectFit
import com.olvind.mui.csstype.mod.Property.OverflowAnchor
import com.olvind.mui.csstype.mod.Property.OverflowBlock
import com.olvind.mui.csstype.mod.Property.OverflowClipBox
import com.olvind.mui.csstype.mod.Property.OverflowInline
import com.olvind.mui.csstype.mod.Property.OverflowWrap
import com.olvind.mui.csstype.mod.Property.OverflowX
import com.olvind.mui.csstype.mod.Property.OverflowY
import com.olvind.mui.csstype.mod.Property.OverscrollBehaviorBlock
import com.olvind.mui.csstype.mod.Property.OverscrollBehaviorInline
import com.olvind.mui.csstype.mod.Property.OverscrollBehaviorX
import com.olvind.mui.csstype.mod.Property.OverscrollBehaviorY
import com.olvind.mui.csstype.mod.Property.PageBreakAfter
import com.olvind.mui.csstype.mod.Property.PageBreakBefore
import com.olvind.mui.csstype.mod.Property.PageBreakInside
import com.olvind.mui.csstype.mod.Property.PointerEvents
import com.olvind.mui.csstype.mod.Property.Position
import com.olvind.mui.csstype.mod.Property.Resize
import com.olvind.mui.csstype.mod.Property.RubyAlign
import com.olvind.mui.csstype.mod.Property.RubyMerge
import com.olvind.mui.csstype.mod.Property.ScrollBehavior
import com.olvind.mui.csstype.mod.Property.ScrollSnapStop
import com.olvind.mui.csstype.mod.Property.ScrollSnapTypeX
import com.olvind.mui.csstype.mod.Property.ScrollSnapTypeY
import com.olvind.mui.csstype.mod.Property.ScrollbarWidth
import com.olvind.mui.csstype.mod.Property.ShapeRendering
import com.olvind.mui.csstype.mod.Property.StrokeLinecap
import com.olvind.mui.csstype.mod.Property.StrokeLinejoin
import com.olvind.mui.csstype.mod.Property.TableLayout
import com.olvind.mui.csstype.mod.Property.TextAlign
import com.olvind.mui.csstype.mod.Property.TextAlignLast
import com.olvind.mui.csstype.mod.Property.TextAnchor
import com.olvind.mui.csstype.mod.Property.TextDecorationSkipInk
import com.olvind.mui.csstype.mod.Property.TextDecorationStyle
import com.olvind.mui.csstype.mod.Property.TextJustify
import com.olvind.mui.csstype.mod.Property.TextOrientation
import com.olvind.mui.csstype.mod.Property.TextRendering
import com.olvind.mui.csstype.mod.Property.TextTransform
import com.olvind.mui.csstype.mod.Property.TransformBox
import com.olvind.mui.csstype.mod.Property.TransformStyle
import com.olvind.mui.csstype.mod.Property.UnicodeBidi
import com.olvind.mui.csstype.mod.Property.UserSelect
import com.olvind.mui.csstype.mod.Property.VectorEffect
import com.olvind.mui.csstype.mod.Property.Visibility
import com.olvind.mui.csstype.mod.Property.WebkitAppearance
import com.olvind.mui.csstype.mod.Property.WebkitMaskRepeatX
import com.olvind.mui.csstype.mod.Property.WebkitMaskRepeatY
import com.olvind.mui.csstype.mod.Property.WebkitOverflowScrolling
import com.olvind.mui.csstype.mod.Property.WebkitTouchCallout
import com.olvind.mui.csstype.mod.Property.WebkitUserModify
import com.olvind.mui.csstype.mod.Property.WhiteSpace
import com.olvind.mui.csstype.mod.Property.WordBreak
import com.olvind.mui.csstype.mod.Property.WordWrap
import com.olvind.mui.csstype.mod.Property.WritingMode
import com.olvind.mui.csstype.mod.Property._AccentColor
import com.olvind.mui.csstype.mod.Property._AlignContent
import com.olvind.mui.csstype.mod.Property._AlignItems
import com.olvind.mui.csstype.mod.Property._AlignSelf
import com.olvind.mui.csstype.mod.Property._AlignTracks
import com.olvind.mui.csstype.mod.Property._AnimationIterationCount
import com.olvind.mui.csstype.mod.Property._AnimationName
import com.olvind.mui.csstype.mod.Property._AnimationPlayState
import com.olvind.mui.csstype.mod.Property._AspectRatio
import com.olvind.mui.csstype.mod.Property._Azimuth
import com.olvind.mui.csstype.mod.Property._BackdropFilter
import com.olvind.mui.csstype.mod.Property._BackgroundImage
import com.olvind.mui.csstype.mod.Property._BackgroundPositionX
import com.olvind.mui.csstype.mod.Property._BackgroundPositionY
import com.olvind.mui.csstype.mod.Property._BaselineShift
import com.olvind.mui.csstype.mod.Property._BlockOverflow
import com.olvind.mui.csstype.mod.Property._BlockSize
import com.olvind.mui.csstype.mod.Property._BorderImage
import com.olvind.mui.csstype.mod.Property._BorderImageRepeat
import com.olvind.mui.csstype.mod.Property._BorderImageSource
import com.olvind.mui.csstype.mod.Property._BorderImageWidth
import com.olvind.mui.csstype.mod.Property._Bottom
import com.olvind.mui.csstype.mod.Property._BoxShadow
import com.olvind.mui.csstype.mod.Property._CaretColor
import com.olvind.mui.csstype.mod.Property._Clip
import com.olvind.mui.csstype.mod.Property._ClipPath
import com.olvind.mui.csstype.mod.Property._ColorScheme
import com.olvind.mui.csstype.mod.Property._ColumnCount
import com.olvind.mui.csstype.mod.Property._ColumnGap
import com.olvind.mui.csstype.mod.Property._ColumnWidth
import com.olvind.mui.csstype.mod.Property._Columns
import com.olvind.mui.csstype.mod.Property._Contain
import com.olvind.mui.csstype.mod.Property._Content
import com.olvind.mui.csstype.mod.Property._CounterIncrement
import com.olvind.mui.csstype.mod.Property._CounterReset
import com.olvind.mui.csstype.mod.Property._CounterSet
import com.olvind.mui.csstype.mod.Property._Cursor
import com.olvind.mui.csstype.mod.Property._Display
import com.olvind.mui.csstype.mod.Property._Filter
import com.olvind.mui.csstype.mod.Property._Flex
import com.olvind.mui.csstype.mod.Property._FlexBasis
import com.olvind.mui.csstype.mod.Property._FlexFlow
import com.olvind.mui.csstype.mod.Property._FloodColor
import com.olvind.mui.csstype.mod.Property._Font
import com.olvind.mui.csstype.mod.Property._FontFeatureSettings
import com.olvind.mui.csstype.mod.Property._FontLanguageOverride
import com.olvind.mui.csstype.mod.Property._FontSize
import com.olvind.mui.csstype.mod.Property._FontSizeAdjust
import com.olvind.mui.csstype.mod.Property._FontSmooth
import com.olvind.mui.csstype.mod.Property._FontStyle
import com.olvind.mui.csstype.mod.Property._FontSynthesis
import com.olvind.mui.csstype.mod.Property._FontVariant
import com.olvind.mui.csstype.mod.Property._FontVariantAlternates
import com.olvind.mui.csstype.mod.Property._FontVariantEastAsian
import com.olvind.mui.csstype.mod.Property._FontVariantLigatures
import com.olvind.mui.csstype.mod.Property._FontVariantNumeric
import com.olvind.mui.csstype.mod.Property._FontVariationSettings
import com.olvind.mui.csstype.mod.Property._FontWeight
import com.olvind.mui.csstype.mod.Property._Gap
import com.olvind.mui.csstype.mod.Property._GlyphOrientationVertical
import com.olvind.mui.csstype.mod.Property._Grid
import com.olvind.mui.csstype.mod.Property._GridAutoFlow
import com.olvind.mui.csstype.mod.Property._GridTemplate
import com.olvind.mui.csstype.mod.Property._GridTemplateAreas
import com.olvind.mui.csstype.mod.Property._GridTemplateColumns
import com.olvind.mui.csstype.mod.Property._GridTemplateRows
import com.olvind.mui.csstype.mod.Property._HangingPunctuation
import com.olvind.mui.csstype.mod.Property._Height
import com.olvind.mui.csstype.mod.Property._ImageOrientation
import com.olvind.mui.csstype.mod.Property._ImageResolution
import com.olvind.mui.csstype.mod.Property._InitialLetter
import com.olvind.mui.csstype.mod.Property._InlineSize
import com.olvind.mui.csstype.mod.Property._Inset
import com.olvind.mui.csstype.mod.Property._InsetBlock
import com.olvind.mui.csstype.mod.Property._InsetBlockEnd
import com.olvind.mui.csstype.mod.Property._InsetBlockStart
import com.olvind.mui.csstype.mod.Property._InsetInline
import com.olvind.mui.csstype.mod.Property._InsetInlineEnd
import com.olvind.mui.csstype.mod.Property._InsetInlineStart
import com.olvind.mui.csstype.mod.Property._JustifyContent
import com.olvind.mui.csstype.mod.Property._JustifyItems
import com.olvind.mui.csstype.mod.Property._JustifySelf
import com.olvind.mui.csstype.mod.Property._JustifyTracks
import com.olvind.mui.csstype.mod.Property._Left
import com.olvind.mui.csstype.mod.Property._LetterSpacing
import com.olvind.mui.csstype.mod.Property._LightingColor
import com.olvind.mui.csstype.mod.Property._LineClamp
import com.olvind.mui.csstype.mod.Property._LineHeight
import com.olvind.mui.csstype.mod.Property._ListStyle
import com.olvind.mui.csstype.mod.Property._ListStyleImage
import com.olvind.mui.csstype.mod.Property._ListStyleType
import com.olvind.mui.csstype.mod.Property._Margin
import com.olvind.mui.csstype.mod.Property._MarginBlock
import com.olvind.mui.csstype.mod.Property._MarginBlockEnd
import com.olvind.mui.csstype.mod.Property._MarginBlockStart
import com.olvind.mui.csstype.mod.Property._MarginBottom
import com.olvind.mui.csstype.mod.Property._MarginInline
import com.olvind.mui.csstype.mod.Property._MarginInlineEnd
import com.olvind.mui.csstype.mod.Property._MarginInlineStart
import com.olvind.mui.csstype.mod.Property._MarginLeft
import com.olvind.mui.csstype.mod.Property._MarginRight
import com.olvind.mui.csstype.mod.Property._MarginTop
import com.olvind.mui.csstype.mod.Property._Marker
import com.olvind.mui.csstype.mod.Property._MarkerEnd
import com.olvind.mui.csstype.mod.Property._MarkerMid
import com.olvind.mui.csstype.mod.Property._MarkerStart
import com.olvind.mui.csstype.mod.Property._MaskBorder
import com.olvind.mui.csstype.mod.Property._MaskBorderRepeat
import com.olvind.mui.csstype.mod.Property._MaskBorderSource
import com.olvind.mui.csstype.mod.Property._MaskBorderWidth
import com.olvind.mui.csstype.mod.Property._MaskClip
import com.olvind.mui.csstype.mod.Property._MaskImage
import com.olvind.mui.csstype.mod.Property._MaxBlockSize
import com.olvind.mui.csstype.mod.Property._MaxHeight
import com.olvind.mui.csstype.mod.Property._MaxInlineSize
import com.olvind.mui.csstype.mod.Property._MaxLines
import com.olvind.mui.csstype.mod.Property._MaxWidth
import com.olvind.mui.csstype.mod.Property._MinBlockSize
import com.olvind.mui.csstype.mod.Property._MinHeight
import com.olvind.mui.csstype.mod.Property._MinInlineSize
import com.olvind.mui.csstype.mod.Property._MinWidth
import com.olvind.mui.csstype.mod.Property._MozBinding
import com.olvind.mui.csstype.mod.Property._MozBorderBottomColors
import com.olvind.mui.csstype.mod.Property._MozBorderLeftColors
import com.olvind.mui.csstype.mod.Property._MozBorderRightColors
import com.olvind.mui.csstype.mod.Property._MozBorderTopColors
import com.olvind.mui.csstype.mod.Property._MozContextProperties
import com.olvind.mui.csstype.mod.Property._MozImageRegion
import com.olvind.mui.csstype.mod.Property._MsContentZoomSnap
import com.olvind.mui.csstype.mod.Property._MsFlowFrom
import com.olvind.mui.csstype.mod.Property._MsFlowInto
import com.olvind.mui.csstype.mod.Property._MsGridColumns
import com.olvind.mui.csstype.mod.Property._MsGridRows
import com.olvind.mui.csstype.mod.Property._MsHyphenateLimitChars
import com.olvind.mui.csstype.mod.Property._MsHyphenateLimitLines
import com.olvind.mui.csstype.mod.Property._MsScrollLimitXMax
import com.olvind.mui.csstype.mod.Property._MsScrollLimitYMax
import com.olvind.mui.csstype.mod.Property._Offset
import com.olvind.mui.csstype.mod.Property._OffsetAnchor
import com.olvind.mui.csstype.mod.Property._OffsetPath
import com.olvind.mui.csstype.mod.Property._OffsetRotate
import com.olvind.mui.csstype.mod.Property._Outline
import com.olvind.mui.csstype.mod.Property._OutlineColor
import com.olvind.mui.csstype.mod.Property._OutlineStyle
import com.olvind.mui.csstype.mod.Property._Overflow
import com.olvind.mui.csstype.mod.Property._OverscrollBehavior
import com.olvind.mui.csstype.mod.Property._PaintOrder
import com.olvind.mui.csstype.mod.Property._Perspective
import com.olvind.mui.csstype.mod.Property._PlaceContent
import com.olvind.mui.csstype.mod.Property._PlaceItems
import com.olvind.mui.csstype.mod.Property._PlaceSelf
import com.olvind.mui.csstype.mod.Property._Quotes
import com.olvind.mui.csstype.mod.Property._Right
import com.olvind.mui.csstype.mod.Property._Rotate
import com.olvind.mui.csstype.mod.Property._RowGap
import com.olvind.mui.csstype.mod.Property._RubyPosition
import com.olvind.mui.csstype.mod.Property._Scale
import com.olvind.mui.csstype.mod.Property._ScrollPadding
import com.olvind.mui.csstype.mod.Property._ScrollPaddingBlock
import com.olvind.mui.csstype.mod.Property._ScrollPaddingBlockEnd
import com.olvind.mui.csstype.mod.Property._ScrollPaddingBlockStart
import com.olvind.mui.csstype.mod.Property._ScrollPaddingBottom
import com.olvind.mui.csstype.mod.Property._ScrollPaddingInline
import com.olvind.mui.csstype.mod.Property._ScrollPaddingInlineEnd
import com.olvind.mui.csstype.mod.Property._ScrollPaddingInlineStart
import com.olvind.mui.csstype.mod.Property._ScrollPaddingLeft
import com.olvind.mui.csstype.mod.Property._ScrollPaddingRight
import com.olvind.mui.csstype.mod.Property._ScrollPaddingTop
import com.olvind.mui.csstype.mod.Property._ScrollSnapAlign
import com.olvind.mui.csstype.mod.Property._ScrollSnapCoordinate
import com.olvind.mui.csstype.mod.Property._ScrollSnapPointsX
import com.olvind.mui.csstype.mod.Property._ScrollSnapPointsY
import com.olvind.mui.csstype.mod.Property._ScrollSnapType
import com.olvind.mui.csstype.mod.Property._ScrollbarColor
import com.olvind.mui.csstype.mod.Property._ScrollbarGutter
import com.olvind.mui.csstype.mod.Property._ShapeOutside
import com.olvind.mui.csstype.mod.Property._StopColor
import com.olvind.mui.csstype.mod.Property._StrokeDasharray
import com.olvind.mui.csstype.mod.Property._TextCombineUpright
import com.olvind.mui.csstype.mod.Property._TextDecoration
import com.olvind.mui.csstype.mod.Property._TextDecorationLine
import com.olvind.mui.csstype.mod.Property._TextDecorationSkip
import com.olvind.mui.csstype.mod.Property._TextDecorationThickness
import com.olvind.mui.csstype.mod.Property._TextEmphasis
import com.olvind.mui.csstype.mod.Property._TextEmphasisStyle
import com.olvind.mui.csstype.mod.Property._TextOverflow
import com.olvind.mui.csstype.mod.Property._TextShadow
import com.olvind.mui.csstype.mod.Property._TextSizeAdjust
import com.olvind.mui.csstype.mod.Property._TextUnderlineOffset
import com.olvind.mui.csstype.mod.Property._TextUnderlinePosition
import com.olvind.mui.csstype.mod.Property._Top
import com.olvind.mui.csstype.mod.Property._TouchAction
import com.olvind.mui.csstype.mod.Property._Transform
import com.olvind.mui.csstype.mod.Property._TransformOrigin
import com.olvind.mui.csstype.mod.Property._TransitionProperty
import com.olvind.mui.csstype.mod.Property._Translate
import com.olvind.mui.csstype.mod.Property._VerticalAlign
import com.olvind.mui.csstype.mod.Property._WebkitBoxReflect
import com.olvind.mui.csstype.mod.Property._WebkitLineClamp
import com.olvind.mui.csstype.mod.Property._WebkitMask
import com.olvind.mui.csstype.mod.Property._WebkitMaskClip
import com.olvind.mui.csstype.mod.Property._WebkitMaskImage
import com.olvind.mui.csstype.mod.Property._WebkitMaskOrigin
import com.olvind.mui.csstype.mod.Property._WebkitMaskPositionX
import com.olvind.mui.csstype.mod.Property._WebkitMaskPositionY
import com.olvind.mui.csstype.mod.Property._Width
import com.olvind.mui.csstype.mod.Property._WillChange
import com.olvind.mui.csstype.mod.Property._WordSpacing
import com.olvind.mui.csstype.mod.Property._ZIndex
import com.olvind.mui.csstype.mod.Property._Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csstypeStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with MozWindowShadow
       with WebkitTouchCallout
       with _Cursor
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `-apple-pay-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `-apple-pay-button`: `-apple-pay-button` = "-apple-pay-button".asInstanceOf[`-apple-pay-button`]
  
  @js.native
  sealed trait `-moz-crisp-edges`
    extends StObject
       with ImageRendering
  @scala.inline
  def `-moz-crisp-edges`: `-moz-crisp-edges` = "-moz-crisp-edges".asInstanceOf[`-moz-crisp-edges`]
  
  @js.native
  sealed trait `-moz-fit-content`
    extends StObject
       with _BlockSize[Any]
       with _InlineSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `-moz-fit-content`: `-moz-fit-content` = "-moz-fit-content".asInstanceOf[`-moz-fit-content`]
  
  @js.native
  sealed trait `-moz-grab`
    extends StObject
       with _Cursor
  @scala.inline
  def `-moz-grab`: `-moz-grab` = "-moz-grab".asInstanceOf[`-moz-grab`]
  
  @js.native
  sealed trait `-moz-hidden-unscrollable`
    extends StObject
       with OverflowX
       with OverflowY
       with _Overflow
  @scala.inline
  def `-moz-hidden-unscrollable`: `-moz-hidden-unscrollable` = "-moz-hidden-unscrollable".asInstanceOf[`-moz-hidden-unscrollable`]
  
  @js.native
  sealed trait `-moz-initial`
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  @scala.inline
  def `-moz-initial`: `-moz-initial` = "-moz-initial".asInstanceOf[`-moz-initial`]
  
  @js.native
  sealed trait `-moz-isolate`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-moz-isolate`: `-moz-isolate` = "-moz-isolate".asInstanceOf[`-moz-isolate`]
  
  @js.native
  sealed trait `-moz-isolate-override`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-moz-isolate-override`: `-moz-isolate-override` = "-moz-isolate-override".asInstanceOf[`-moz-isolate-override`]
  
  @js.native
  sealed trait `-moz-mac-unified-toolbar`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-mac-unified-toolbar`: `-moz-mac-unified-toolbar` = "-moz-mac-unified-toolbar".asInstanceOf[`-moz-mac-unified-toolbar`]
  
  @js.native
  sealed trait `-moz-max-content`
    extends StObject
       with _BlockSize[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `-moz-max-content`: `-moz-max-content` = "-moz-max-content".asInstanceOf[`-moz-max-content`]
  
  @js.native
  sealed trait `-moz-min-content`
    extends StObject
       with _BlockSize[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `-moz-min-content`: `-moz-min-content` = "-moz-min-content".asInstanceOf[`-moz-min-content`]
  
  @js.native
  sealed trait `-moz-none`
    extends StObject
       with UserSelect
  @scala.inline
  def `-moz-none`: `-moz-none` = "-moz-none".asInstanceOf[`-moz-none`]
  
  @js.native
  sealed trait `-moz-plaintext`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-moz-plaintext`: `-moz-plaintext` = "-moz-plaintext".asInstanceOf[`-moz-plaintext`]
  
  @js.native
  sealed trait `-moz-pre-wrap`
    extends StObject
       with WhiteSpace
  @scala.inline
  def `-moz-pre-wrap`: `-moz-pre-wrap` = "-moz-pre-wrap".asInstanceOf[`-moz-pre-wrap`]
  
  @js.native
  sealed trait `-moz-win-borderless-glass`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-borderless-glass`: `-moz-win-borderless-glass` = "-moz-win-borderless-glass".asInstanceOf[`-moz-win-borderless-glass`]
  
  @js.native
  sealed trait `-moz-win-browsertabbar-toolbox`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-browsertabbar-toolbox`: `-moz-win-browsertabbar-toolbox` = "-moz-win-browsertabbar-toolbox".asInstanceOf[`-moz-win-browsertabbar-toolbox`]
  
  @js.native
  sealed trait `-moz-win-communications-toolbox`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-communications-toolbox`: `-moz-win-communications-toolbox` = "-moz-win-communications-toolbox".asInstanceOf[`-moz-win-communications-toolbox`]
  
  @js.native
  sealed trait `-moz-win-communicationstext`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-communicationstext`: `-moz-win-communicationstext` = "-moz-win-communicationstext".asInstanceOf[`-moz-win-communicationstext`]
  
  @js.native
  sealed trait `-moz-win-exclude-glass`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-exclude-glass`: `-moz-win-exclude-glass` = "-moz-win-exclude-glass".asInstanceOf[`-moz-win-exclude-glass`]
  
  @js.native
  sealed trait `-moz-win-glass`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-glass`: `-moz-win-glass` = "-moz-win-glass".asInstanceOf[`-moz-win-glass`]
  
  @js.native
  sealed trait `-moz-win-media-toolbox`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-media-toolbox`: `-moz-win-media-toolbox` = "-moz-win-media-toolbox".asInstanceOf[`-moz-win-media-toolbox`]
  
  @js.native
  sealed trait `-moz-win-mediatext`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-win-mediatext`: `-moz-win-mediatext` = "-moz-win-mediatext".asInstanceOf[`-moz-win-mediatext`]
  
  @js.native
  sealed trait `-moz-window-button-box`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-box`: `-moz-window-button-box` = "-moz-window-button-box".asInstanceOf[`-moz-window-button-box`]
  
  @js.native
  sealed trait `-moz-window-button-box-maximized`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-box-maximized`: `-moz-window-button-box-maximized` = "-moz-window-button-box-maximized".asInstanceOf[`-moz-window-button-box-maximized`]
  
  @js.native
  sealed trait `-moz-window-button-close`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-close`: `-moz-window-button-close` = "-moz-window-button-close".asInstanceOf[`-moz-window-button-close`]
  
  @js.native
  sealed trait `-moz-window-button-maximize`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-maximize`: `-moz-window-button-maximize` = "-moz-window-button-maximize".asInstanceOf[`-moz-window-button-maximize`]
  
  @js.native
  sealed trait `-moz-window-button-minimize`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-minimize`: `-moz-window-button-minimize` = "-moz-window-button-minimize".asInstanceOf[`-moz-window-button-minimize`]
  
  @js.native
  sealed trait `-moz-window-button-restore`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-button-restore`: `-moz-window-button-restore` = "-moz-window-button-restore".asInstanceOf[`-moz-window-button-restore`]
  
  @js.native
  sealed trait `-moz-window-frame-bottom`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-frame-bottom`: `-moz-window-frame-bottom` = "-moz-window-frame-bottom".asInstanceOf[`-moz-window-frame-bottom`]
  
  @js.native
  sealed trait `-moz-window-frame-left`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-frame-left`: `-moz-window-frame-left` = "-moz-window-frame-left".asInstanceOf[`-moz-window-frame-left`]
  
  @js.native
  sealed trait `-moz-window-frame-right`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-frame-right`: `-moz-window-frame-right` = "-moz-window-frame-right".asInstanceOf[`-moz-window-frame-right`]
  
  @js.native
  sealed trait `-moz-window-titlebar`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-titlebar`: `-moz-window-titlebar` = "-moz-window-titlebar".asInstanceOf[`-moz-window-titlebar`]
  
  @js.native
  sealed trait `-moz-window-titlebar-maximized`
    extends StObject
       with MozAppearance
  @scala.inline
  def `-moz-window-titlebar-maximized`: `-moz-window-titlebar-maximized` = "-moz-window-titlebar-maximized".asInstanceOf[`-moz-window-titlebar-maximized`]
  
  @js.native
  sealed trait `-ms-autohiding-scrollbar`
    extends StObject
       with MsOverflowStyle
  @scala.inline
  def `-ms-autohiding-scrollbar`: `-ms-autohiding-scrollbar` = "-ms-autohiding-scrollbar".asInstanceOf[`-ms-autohiding-scrollbar`]
  
  @js.native
  sealed trait `-ms-flexbox`
    extends StObject
       with DisplayInside
  @scala.inline
  def `-ms-flexbox`: `-ms-flexbox` = "-ms-flexbox".asInstanceOf[`-ms-flexbox`]
  
  @js.native
  sealed trait `-ms-grid`
    extends StObject
       with DisplayInside
  @scala.inline
  def `-ms-grid`: `-ms-grid` = "-ms-grid".asInstanceOf[`-ms-grid`]
  
  @js.native
  sealed trait `-ms-inline-flexbox`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `-ms-inline-flexbox`: `-ms-inline-flexbox` = "-ms-inline-flexbox".asInstanceOf[`-ms-inline-flexbox`]
  
  @js.native
  sealed trait `-ms-inline-grid`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `-ms-inline-grid`: `-ms-inline-grid` = "-ms-inline-grid".asInstanceOf[`-ms-inline-grid`]
  
  @js.native
  sealed trait `-ms-manipulation`
    extends StObject
       with _TouchAction
  @scala.inline
  def `-ms-manipulation`: `-ms-manipulation` = "-ms-manipulation".asInstanceOf[`-ms-manipulation`]
  
  @js.native
  sealed trait `-ms-none`
    extends StObject
       with _TouchAction
  @scala.inline
  def `-ms-none`: `-ms-none` = "-ms-none".asInstanceOf[`-ms-none`]
  
  @js.native
  sealed trait `-ms-pinch-zoom`
    extends StObject
       with _TouchAction
  @scala.inline
  def `-ms-pinch-zoom`: `-ms-pinch-zoom` = "-ms-pinch-zoom".asInstanceOf[`-ms-pinch-zoom`]
  
  @js.native
  sealed trait `-webkit-auto`
    extends StObject
       with _FlexBasis[Any]
  @scala.inline
  def `-webkit-auto`: `-webkit-auto` = "-webkit-auto".asInstanceOf[`-webkit-auto`]
  
  @js.native
  sealed trait `-webkit-fill-available`
    extends StObject
       with _BlockSize[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxInlineSize[Any]
       with _MinBlockSize[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
  @scala.inline
  def `-webkit-fill-available`: `-webkit-fill-available` = "-webkit-fill-available".asInstanceOf[`-webkit-fill-available`]
  
  @js.native
  sealed trait `-webkit-fit-content`
    extends StObject
       with _Height[Any]
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `-webkit-fit-content`: `-webkit-fit-content` = "-webkit-fit-content".asInstanceOf[`-webkit-fit-content`]
  
  @js.native
  sealed trait `-webkit-flex`
    extends StObject
       with DisplayInside
  @scala.inline
  def `-webkit-flex`: `-webkit-flex` = "-webkit-flex".asInstanceOf[`-webkit-flex`]
  
  @js.native
  sealed trait `-webkit-grab`
    extends StObject
       with _Cursor
  @scala.inline
  def `-webkit-grab`: `-webkit-grab` = "-webkit-grab".asInstanceOf[`-webkit-grab`]
  
  @js.native
  sealed trait `-webkit-inline-flex`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `-webkit-inline-flex`: `-webkit-inline-flex` = "-webkit-inline-flex".asInstanceOf[`-webkit-inline-flex`]
  
  @js.native
  sealed trait `-webkit-isolate`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-webkit-isolate`: `-webkit-isolate` = "-webkit-isolate".asInstanceOf[`-webkit-isolate`]
  
  @js.native
  sealed trait `-webkit-isolate-override`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-webkit-isolate-override`: `-webkit-isolate-override` = "-webkit-isolate-override".asInstanceOf[`-webkit-isolate-override`]
  
  @js.native
  sealed trait `-webkit-max-content`
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `-webkit-max-content`: `-webkit-max-content` = "-webkit-max-content".asInstanceOf[`-webkit-max-content`]
  
  @js.native
  sealed trait `-webkit-min-content`
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
  @scala.inline
  def `-webkit-min-content`: `-webkit-min-content` = "-webkit-min-content".asInstanceOf[`-webkit-min-content`]
  
  @js.native
  sealed trait `-webkit-optimize-contrast`
    extends StObject
       with ImageRendering
  @scala.inline
  def `-webkit-optimize-contrast`: `-webkit-optimize-contrast` = "-webkit-optimize-contrast".asInstanceOf[`-webkit-optimize-contrast`]
  
  @js.native
  sealed trait `-webkit-plaintext`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `-webkit-plaintext`: `-webkit-plaintext` = "-webkit-plaintext".asInstanceOf[`-webkit-plaintext`]
  
  @js.native
  sealed trait `-webkit-sticky`
    extends StObject
       with Position
  @scala.inline
  def `-webkit-sticky`: `-webkit-sticky` = "-webkit-sticky".asInstanceOf[`-webkit-sticky`]
  
  @js.native
  sealed trait A3
    extends StObject
       with PageSize
  @scala.inline
  def A3: A3 = "A3".asInstanceOf[A3]
  
  @js.native
  sealed trait A4
    extends StObject
       with PageSize
  @scala.inline
  def A4: A4 = "A4".asInstanceOf[A4]
  
  @js.native
  sealed trait A5
    extends StObject
       with PageSize
  @scala.inline
  def A5: A5 = "A5".asInstanceOf[A5]
  
  @js.native
  sealed trait ActiveBorder
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ActiveBorder: ActiveBorder = "ActiveBorder".asInstanceOf[ActiveBorder]
  
  @js.native
  sealed trait ActiveCaption
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ActiveCaption: ActiveCaption = "ActiveCaption".asInstanceOf[ActiveCaption]
  
  @js.native
  sealed trait AppWorkspace
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def AppWorkspace: AppWorkspace = "AppWorkspace".asInstanceOf[AppWorkspace]
  
  @js.native
  sealed trait B4
    extends StObject
       with PageSize
  @scala.inline
  def B4: B4 = "B4".asInstanceOf[B4]
  
  @js.native
  sealed trait B5
    extends StObject
       with PageSize
  @scala.inline
  def B5: B5 = "B5".asInstanceOf[B5]
  
  @js.native
  sealed trait Background
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def Background: Background = "Background".asInstanceOf[Background]
  
  @js.native
  sealed trait ButtonFace
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ButtonFace: ButtonFace = "ButtonFace".asInstanceOf[ButtonFace]
  
  @js.native
  sealed trait ButtonHighlight
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ButtonHighlight: ButtonHighlight = "ButtonHighlight".asInstanceOf[ButtonHighlight]
  
  @js.native
  sealed trait ButtonShadow
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ButtonShadow: ButtonShadow = "ButtonShadow".asInstanceOf[ButtonShadow]
  
  @js.native
  sealed trait ButtonText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ButtonText: ButtonText = "ButtonText".asInstanceOf[ButtonText]
  
  @js.native
  sealed trait CaptionText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def CaptionText: CaptionText = "CaptionText".asInstanceOf[CaptionText]
  
  @js.native
  sealed trait GrayText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def GrayText: GrayText = "GrayText".asInstanceOf[GrayText]
  
  @js.native
  sealed trait Highlight
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def Highlight: Highlight = "Highlight".asInstanceOf[Highlight]
  
  @js.native
  sealed trait HighlightText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def HighlightText: HighlightText = "HighlightText".asInstanceOf[HighlightText]
  
  @js.native
  sealed trait InactiveBorder
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def InactiveBorder: InactiveBorder = "InactiveBorder".asInstanceOf[InactiveBorder]
  
  @js.native
  sealed trait InactiveCaption
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def InactiveCaption: InactiveCaption = "InactiveCaption".asInstanceOf[InactiveCaption]
  
  @js.native
  sealed trait InactiveCaptionText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def InactiveCaptionText: InactiveCaptionText = "InactiveCaptionText".asInstanceOf[InactiveCaptionText]
  
  @js.native
  sealed trait InfoBackground
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def InfoBackground: InfoBackground = "InfoBackground".asInstanceOf[InfoBackground]
  
  @js.native
  sealed trait InfoText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def InfoText: InfoText = "InfoText".asInstanceOf[InfoText]
  
  @js.native
  sealed trait `JIS-B4`
    extends StObject
       with PageSize
  @scala.inline
  def `JIS-B4`: `JIS-B4` = "JIS-B4".asInstanceOf[`JIS-B4`]
  
  @js.native
  sealed trait `JIS-B5`
    extends StObject
       with PageSize
  @scala.inline
  def `JIS-B5`: `JIS-B5` = "JIS-B5".asInstanceOf[`JIS-B5`]
  
  @js.native
  sealed trait Menu
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def Menu: Menu = "Menu".asInstanceOf[Menu]
  
  @js.native
  sealed trait MenuText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def MenuText: MenuText = "MenuText".asInstanceOf[MenuText]
  
  @js.native
  sealed trait Scrollbar
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def Scrollbar: Scrollbar = "Scrollbar".asInstanceOf[Scrollbar]
  
  @js.native
  sealed trait ThreeDDarkShadow
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ThreeDDarkShadow: ThreeDDarkShadow = "ThreeDDarkShadow".asInstanceOf[ThreeDDarkShadow]
  
  @js.native
  sealed trait ThreeDFace
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ThreeDFace: ThreeDFace = "ThreeDFace".asInstanceOf[ThreeDFace]
  
  @js.native
  sealed trait ThreeDHighlight
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ThreeDHighlight: ThreeDHighlight = "ThreeDHighlight".asInstanceOf[ThreeDHighlight]
  
  @js.native
  sealed trait ThreeDLightShadow
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ThreeDLightShadow: ThreeDLightShadow = "ThreeDLightShadow".asInstanceOf[ThreeDLightShadow]
  
  @js.native
  sealed trait ThreeDShadow
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def ThreeDShadow: ThreeDShadow = "ThreeDShadow".asInstanceOf[ThreeDShadow]
  
  @js.native
  sealed trait Window
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def Window: Window = "Window".asInstanceOf[Window]
  
  @js.native
  sealed trait WindowFrame
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def WindowFrame: WindowFrame = "WindowFrame".asInstanceOf[WindowFrame]
  
  @js.native
  sealed trait WindowText
    extends StObject
       with DeprecatedSystemColor
  @scala.inline
  def WindowText: WindowText = "WindowText".asInstanceOf[WindowText]
  
  @js.native
  sealed trait above
    extends StObject
       with _WebkitBoxReflect[Any]
  @scala.inline
  def above: above = "above".asInstanceOf[above]
  
  @js.native
  sealed trait absolute
    extends StObject
       with Position
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait active
    extends StObject
       with ImeMode
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add
    extends StObject
       with CompositingOperator
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait additive
    extends StObject
       with _System
  @scala.inline
  def additive: additive = "additive".asInstanceOf[additive]
  
  @js.native
  sealed trait after
    extends StObject
       with MsImeAlign
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait `after-edge`
    extends StObject
       with AlignmentBaseline
  @scala.inline
  def `after-edge`: `after-edge` = "after-edge".asInstanceOf[`after-edge`]
  
  @js.native
  sealed trait alias
    extends StObject
       with _Cursor
  @scala.inline
  def alias: alias = "alias".asInstanceOf[alias]
  
  @js.native
  sealed trait aliceblue
    extends StObject
       with NamedColor
  @scala.inline
  def aliceblue: aliceblue = "aliceblue".asInstanceOf[aliceblue]
  
  @js.native
  sealed trait all
    extends StObject
       with BreakAfter
       with BreakBefore
       with ColumnSpan
       with PointerEvents
       with TextDecorationSkipInk
       with UserSelect
       with _SingleTransition[Any]
       with _TextCombineUpright
       with _TransitionProperty
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `all-petite-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def `all-petite-caps`: `all-petite-caps` = "all-petite-caps".asInstanceOf[`all-petite-caps`]
  
  @js.native
  sealed trait `all-scroll`
    extends StObject
       with _Cursor
  @scala.inline
  def `all-scroll`: `all-scroll` = "all-scroll".asInstanceOf[`all-scroll`]
  
  @js.native
  sealed trait `all-small-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def `all-small-caps`: `all-small-caps` = "all-small-caps".asInstanceOf[`all-small-caps`]
  
  @js.native
  sealed trait `allow-end`
    extends StObject
       with _HangingPunctuation
  @scala.inline
  def `allow-end`: `allow-end` = "allow-end".asInstanceOf[`allow-end`]
  
  @js.native
  sealed trait alpha
    extends StObject
       with MaskBorderMode
       with MaskType
       with MaskingMode
       with _MaskBorder
  @scala.inline
  def alpha: alpha = "alpha".asInstanceOf[alpha]
  
  @js.native
  sealed trait alphabetic
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
       with _System
  @scala.inline
  def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  
  @js.native
  sealed trait alternate
    extends StObject
       with SingleAnimationDirection
       with _RubyPosition
  @scala.inline
  def alternate: alternate = "alternate".asInstanceOf[alternate]
  
  @js.native
  sealed trait `alternate-reverse`
    extends StObject
       with SingleAnimationDirection
  @scala.inline
  def `alternate-reverse`: `alternate-reverse` = "alternate-reverse".asInstanceOf[`alternate-reverse`]
  
  @js.native
  sealed trait always
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
       with ScrollSnapStop
       with _FontSmooth[Any]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait antiquewhite
    extends StObject
       with NamedColor
  @scala.inline
  def antiquewhite: antiquewhite = "antiquewhite".asInstanceOf[antiquewhite]
  
  @js.native
  sealed trait anywhere
    extends StObject
       with LineBreak
       with OverflowWrap
  @scala.inline
  def anywhere: anywhere = "anywhere".asInstanceOf[anywhere]
  
  @js.native
  sealed trait aqua
    extends StObject
       with NamedColor
  @scala.inline
  def aqua: aqua = "aqua".asInstanceOf[aqua]
  
  @js.native
  sealed trait aquamarine
    extends StObject
       with NamedColor
  @scala.inline
  def aquamarine: aquamarine = "aquamarine".asInstanceOf[aquamarine]
  
  @js.native
  sealed trait auto
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BreakAfter
       with BreakBefore
       with BreakInside
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ContentVisibility
       with DominantBaseline
       with FontDisplay
       with FontKerning
       with FontOpticalSizing
       with ForcedColorAdjust
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with MozUserInput
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsWrapFlow
       with Orientation
       with OverflowAnchor
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with RubyMerge
       with ScrollBehavior
       with ScrollbarWidth
       with ShapeRendering
       with TableLayout
       with TextAlignLast
       with TextDecorationSkipInk
       with TextJustify
       with TextRendering
       with UserSelect
       with ViewportFit
       with WebkitOverflowScrolling
       with _AccentColor
       with _AlignSelf
       with _AspectRatio
       with _BgSize[Any]
       with _BlockSize[Any]
       with _BorderImageWidth[Any]
       with _Bottom[Any]
       with _CaretColor
       with _Clip
       with _ColumnCount
       with _ColumnWidth[Any]
       with _Columns[Any]
       with _Cursor
       with _Flex[Any]
       with _FlexBasis[Any]
       with _FontSmooth[Any]
       with _GlyphOrientationVertical
       with _Height[Any]
       with _InlineSize[Any]
       with _Inset[Any]
       with _InsetBlock[Any]
       with _InsetBlockEnd[Any]
       with _InsetBlockStart[Any]
       with _InsetInline[Any]
       with _InsetInlineEnd[Any]
       with _InsetInlineStart[Any]
       with _JustifySelf
       with _Left[Any]
       with _Margin[Any]
       with _MarginBlock[Any]
       with _MarginBlockEnd[Any]
       with _MarginBlockStart[Any]
       with _MarginBottom[Any]
       with _MarginInline[Any]
       with _MarginInlineEnd[Any]
       with _MarginInlineStart[Any]
       with _MarginLeft[Any]
       with _MarginRight[Any]
       with _MarginTop[Any]
       with _MaskBorderWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _MozImageRegion
       with _MsHyphenateLimitChars
       with _MsScrollLimitXMax[Any]
       with _MsScrollLimitYMax[Any]
       with _Offset[Any]
       with _OffsetAnchor[Any]
       with _OffsetRotate
       with _Outline[Any]
       with _OutlineStyle
       with _Overflow
       with _OverscrollBehavior
       with _PlaceSelf
       with _Quotes
       with _Right[Any]
       with _ScrollPadding[Any]
       with _ScrollPaddingBlock[Any]
       with _ScrollPaddingBlockEnd[Any]
       with _ScrollPaddingBlockStart[Any]
       with _ScrollPaddingBottom[Any]
       with _ScrollPaddingInline[Any]
       with _ScrollPaddingInlineEnd[Any]
       with _ScrollPaddingInlineStart[Any]
       with _ScrollPaddingLeft[Any]
       with _ScrollPaddingRight[Any]
       with _ScrollPaddingTop[Any]
       with _ScrollbarColor
       with _ScrollbarGutter
       with _Size[Any]
       with _SpeakAs
       with _TextDecoration[Any]
       with _TextDecorationThickness[Any]
       with _TextSizeAdjust
       with _TextUnderlineOffset[Any]
       with _TextUnderlinePosition
       with _Top[Any]
       with _TouchAction
       with _TrackBreadth[Any]
       with _Width[Any]
       with _WillChange
       with _ZIndex
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait avoid
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
  @scala.inline
  def avoid: avoid = "avoid".asInstanceOf[avoid]
  
  @js.native
  sealed trait `avoid-column`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  @scala.inline
  def `avoid-column`: `avoid-column` = "avoid-column".asInstanceOf[`avoid-column`]
  
  @js.native
  sealed trait `avoid-page`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  @scala.inline
  def `avoid-page`: `avoid-page` = "avoid-page".asInstanceOf[`avoid-page`]
  
  @js.native
  sealed trait `avoid-region`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  @scala.inline
  def `avoid-region`: `avoid-region` = "avoid-region".asInstanceOf[`avoid-region`]
  
  @js.native
  sealed trait azure
    extends StObject
       with NamedColor
  @scala.inline
  def azure: azure = "azure".asInstanceOf[azure]
  
  @js.native
  sealed trait backwards
    extends StObject
       with SingleAnimationFillMode
  @scala.inline
  def backwards: backwards = "backwards".asInstanceOf[backwards]
  
  @js.native
  sealed trait balance
    extends StObject
       with ColumnFill
  @scala.inline
  def balance: balance = "balance".asInstanceOf[balance]
  
  @js.native
  sealed trait `balance-all`
    extends StObject
       with ColumnFill
  @scala.inline
  def `balance-all`: `balance-all` = "balance-all".asInstanceOf[`balance-all`]
  
  @js.native
  sealed trait baseline
    extends StObject
       with AlignmentBaseline
       with BoxAlign
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _AlignTracks
       with _BaselineShift[Any]
       with _JustifyItems
       with _JustifySelf
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _VerticalAlign[Any]
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait `before-edge`
    extends StObject
       with AlignmentBaseline
  @scala.inline
  def `before-edge`: `before-edge` = "before-edge".asInstanceOf[`before-edge`]
  
  @js.native
  sealed trait behind
    extends StObject
       with _Azimuth
  @scala.inline
  def behind: behind = "behind".asInstanceOf[behind]
  
  @js.native
  sealed trait beige
    extends StObject
       with NamedColor
  @scala.inline
  def beige: beige = "beige".asInstanceOf[beige]
  
  @js.native
  sealed trait below
    extends StObject
       with _WebkitBoxReflect[Any]
  @scala.inline
  def below: below = "below".asInstanceOf[below]
  
  @js.native
  sealed trait bevel
    extends StObject
       with StrokeLinejoin
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait `bidi-override`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `bidi-override`: `bidi-override` = "bidi-override".asInstanceOf[`bidi-override`]
  
  @js.native
  sealed trait bisque
    extends StObject
       with NamedColor
  @scala.inline
  def bisque: bisque = "bisque".asInstanceOf[bisque]
  
  @js.native
  sealed trait black
    extends StObject
       with NamedColor
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait blanchedalmond
    extends StObject
       with NamedColor
  @scala.inline
  def blanchedalmond: blanchedalmond = "blanchedalmond".asInstanceOf[blanchedalmond]
  
  @js.native
  sealed trait blink
    extends StObject
       with MozTextBlink
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def blink: blink = "blink".asInstanceOf[blink]
  
  @js.native
  sealed trait block
    extends StObject
       with DisplayOutside
       with FontDisplay
       with MozOrient
       with Resize
       with _ScrollSnapType
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait `block-axis`
    extends StObject
       with BoxOrient
  @scala.inline
  def `block-axis`: `block-axis` = "block-axis".asInstanceOf[`block-axis`]
  
  @js.native
  sealed trait `block-end`
    extends StObject
       with CaptionSide
  @scala.inline
  def `block-end`: `block-end` = "block-end".asInstanceOf[`block-end`]
  
  @js.native
  sealed trait `block-start`
    extends StObject
       with CaptionSide
  @scala.inline
  def `block-start`: `block-start` = "block-start".asInstanceOf[`block-start`]
  
  @js.native
  sealed trait blue
    extends StObject
       with NamedColor
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait blueviolet
    extends StObject
       with NamedColor
  @scala.inline
  def blueviolet: blueviolet = "blueviolet".asInstanceOf[blueviolet]
  
  @js.native
  sealed trait bold
    extends StObject
       with _FontWeightAbsolute
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bolder
    extends StObject
       with _FontWeight
  @scala.inline
  def bolder: bolder = "bolder".asInstanceOf[bolder]
  
  @js.native
  sealed trait border
    extends StObject
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  @scala.inline
  def border: border = "border".asInstanceOf[border]
  
  @js.native
  sealed trait `border-box`
    extends StObject
       with Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with TransformBox
       with VisualBox
  @scala.inline
  def `border-box`: `border-box` = "border-box".asInstanceOf[`border-box`]
  
  @js.native
  sealed trait both
    extends StObject
       with Clear
       with MsWrapFlow
       with Resize
       with SingleAnimationFillMode
       with _ScrollSnapType
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom
    extends StObject
       with CaptionSide
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _TransformOrigin[Any]
       with _VerticalAlign[Any]
       with _WebkitMaskPositionY[Any]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `box-decoration`
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def `box-decoration`: `box-decoration` = "box-decoration".asInstanceOf[`box-decoration`]
  
  @js.native
  sealed trait `break-all`
    extends StObject
       with WordBreak
  @scala.inline
  def `break-all`: `break-all` = "break-all".asInstanceOf[`break-all`]
  
  @js.native
  sealed trait `break-spaces`
    extends StObject
       with WhiteSpace
  @scala.inline
  def `break-spaces`: `break-spaces` = "break-spaces".asInstanceOf[`break-spaces`]
  
  @js.native
  sealed trait `break-word`
    extends StObject
       with OverflowWrap
       with WordBreak
       with WordWrap
  @scala.inline
  def `break-word`: `break-word` = "break-word".asInstanceOf[`break-word`]
  
  @js.native
  sealed trait brown
    extends StObject
       with NamedColor
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  
  @js.native
  sealed trait bt
    extends StObject
       with MsBlockProgression
  @scala.inline
  def bt: bt = "bt".asInstanceOf[bt]
  
  @js.native
  sealed trait bullets
    extends StObject
       with _SpeakAs
  @scala.inline
  def bullets: bullets = "bullets".asInstanceOf[bullets]
  
  @js.native
  sealed trait burlywood
    extends StObject
       with NamedColor
  @scala.inline
  def burlywood: burlywood = "burlywood".asInstanceOf[burlywood]
  
  @js.native
  sealed trait butt
    extends StObject
       with StrokeLinecap
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait button
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait `button-arrow-down`
    extends StObject
       with MozAppearance
  @scala.inline
  def `button-arrow-down`: `button-arrow-down` = "button-arrow-down".asInstanceOf[`button-arrow-down`]
  
  @js.native
  sealed trait `button-arrow-next`
    extends StObject
       with MozAppearance
  @scala.inline
  def `button-arrow-next`: `button-arrow-next` = "button-arrow-next".asInstanceOf[`button-arrow-next`]
  
  @js.native
  sealed trait `button-arrow-previous`
    extends StObject
       with MozAppearance
  @scala.inline
  def `button-arrow-previous`: `button-arrow-previous` = "button-arrow-previous".asInstanceOf[`button-arrow-previous`]
  
  @js.native
  sealed trait `button-arrow-up`
    extends StObject
       with MozAppearance
  @scala.inline
  def `button-arrow-up`: `button-arrow-up` = "button-arrow-up".asInstanceOf[`button-arrow-up`]
  
  @js.native
  sealed trait `button-bevel`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def `button-bevel`: `button-bevel` = "button-bevel".asInstanceOf[`button-bevel`]
  
  @js.native
  sealed trait `button-focus`
    extends StObject
       with MozAppearance
  @scala.inline
  def `button-focus`: `button-focus` = "button-focus".asInstanceOf[`button-focus`]
  
  @js.native
  sealed trait cadetblue
    extends StObject
       with NamedColor
  @scala.inline
  def cadetblue: cadetblue = "cadetblue".asInstanceOf[cadetblue]
  
  @js.native
  sealed trait capitalize
    extends StObject
       with TextTransform
  @scala.inline
  def capitalize: capitalize = "capitalize".asInstanceOf[capitalize]
  
  @js.native
  sealed trait caption
    extends StObject
       with _Font
  @scala.inline
  def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait caret
    extends StObject
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def caret: caret = "caret".asInstanceOf[caret]
  
  @js.native
  sealed trait cell
    extends StObject
       with _Cursor
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait center
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with RubyAlign
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _ScrollSnapAlign
       with _TransformOrigin[Any]
       with _WebkitMaskPositionX[Any]
       with _WebkitMaskPositionY[Any]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center-left`
    extends StObject
       with _Azimuth
  @scala.inline
  def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  
  @js.native
  sealed trait `center-right`
    extends StObject
       with _Azimuth
  @scala.inline
  def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  
  @js.native
  sealed trait central
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def central: central = "central".asInstanceOf[central]
  
  @js.native
  sealed trait chained
    extends StObject
       with MsContentZoomChaining
       with MsScrollChaining
  @scala.inline
  def chained: chained = "chained".asInstanceOf[chained]
  
  @js.native
  sealed trait chartreuse
    extends StObject
       with NamedColor
  @scala.inline
  def chartreuse: chartreuse = "chartreuse".asInstanceOf[chartreuse]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait `checkbox-container`
    extends StObject
       with MozAppearance
  @scala.inline
  def `checkbox-container`: `checkbox-container` = "checkbox-container".asInstanceOf[`checkbox-container`]
  
  @js.native
  sealed trait `checkbox-label`
    extends StObject
       with MozAppearance
  @scala.inline
  def `checkbox-label`: `checkbox-label` = "checkbox-label".asInstanceOf[`checkbox-label`]
  
  @js.native
  sealed trait checkmenuitem
    extends StObject
       with MozAppearance
  @scala.inline
  def checkmenuitem: checkmenuitem = "checkmenuitem".asInstanceOf[checkmenuitem]
  
  @js.native
  sealed trait child
    extends StObject
       with _Paint
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait chocolate
    extends StObject
       with NamedColor
  @scala.inline
  def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  
  @js.native
  sealed trait circle
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait clear
    extends StObject
       with CompositeStyle
       with MsWrapFlow
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait clip
    extends StObject
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with _BlockOverflow
       with _Overflow
       with _TextOverflow
  @scala.inline
  def clip: clip = "clip".asInstanceOf[clip]
  
  @js.native
  sealed trait clone
    extends StObject
       with BoxDecorationBreak
  
  @js.native
  sealed trait `close-quote`
    extends StObject
       with Quote
  @scala.inline
  def `close-quote`: `close-quote` = "close-quote".asInstanceOf[`close-quote`]
  
  @js.native
  sealed trait `col-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `col-resize`: `col-resize` = "col-resize".asInstanceOf[`col-resize`]
  
  @js.native
  sealed trait collapse
    extends StObject
       with BorderCollapse
       with RubyMerge
       with Visibility
  @scala.inline
  def collapse: collapse = "collapse".asInstanceOf[collapse]
  
  @js.native
  sealed trait color
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait `color-burn`
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def `color-burn`: `color-burn` = "color-burn".asInstanceOf[`color-burn`]
  
  @js.native
  sealed trait `color-dodge`
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def `color-dodge`: `color-dodge` = "color-dodge".asInstanceOf[`color-dodge`]
  
  @js.native
  sealed trait column
    extends StObject
       with BreakAfter
       with BreakBefore
       with FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait `column-reverse`
    extends StObject
       with FlexDirection
       with _FlexFlow
  @scala.inline
  def `column-reverse`: `column-reverse` = "column-reverse".asInstanceOf[`column-reverse`]
  
  @js.native
  sealed trait `common-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `common-ligatures`: `common-ligatures` = "common-ligatures".asInstanceOf[`common-ligatures`]
  
  @js.native
  sealed trait compact
    extends StObject
       with MathStyle
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait condensed
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def condensed: condensed = "condensed".asInstanceOf[condensed]
  
  @js.native
  sealed trait contain
    extends StObject
       with ObjectFit
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with UserSelect
       with ViewportFit
       with _BgSize[Any]
       with _OverscrollBehavior
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  
  @js.native
  sealed trait content
    extends StObject
       with _Contain
       with _Flex[Any]
       with _FlexBasis[Any]
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait `content-box`
    extends StObject
       with Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
       with TransformBox
       with VisualBox
  @scala.inline
  def `content-box`: `content-box` = "content-box".asInstanceOf[`content-box`]
  
  @js.native
  sealed trait contents
    extends StObject
       with _AnimateableFeature
       with _ContentList
       with _Display
  @scala.inline
  def contents: contents = "contents".asInstanceOf[contents]
  
  @js.native
  sealed trait `context-fill`
    extends StObject
       with _Paint
  @scala.inline
  def `context-fill`: `context-fill` = "context-fill".asInstanceOf[`context-fill`]
  
  @js.native
  sealed trait `context-menu`
    extends StObject
       with _Cursor
  @scala.inline
  def `context-menu`: `context-menu` = "context-menu".asInstanceOf[`context-menu`]
  
  @js.native
  sealed trait `context-stroke`
    extends StObject
       with _Paint
  @scala.inline
  def `context-stroke`: `context-stroke` = "context-stroke".asInstanceOf[`context-stroke`]
  
  @js.native
  sealed trait contextual
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def contextual: contextual = "contextual".asInstanceOf[contextual]
  
  @js.native
  sealed trait copy
    extends StObject
       with CompositeStyle
       with _Cursor
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait coral
    extends StObject
       with NamedColor
  @scala.inline
  def coral: coral = "coral".asInstanceOf[coral]
  
  @js.native
  sealed trait cornflowerblue
    extends StObject
       with NamedColor
  @scala.inline
  def cornflowerblue: cornflowerblue = "cornflowerblue".asInstanceOf[cornflowerblue]
  
  @js.native
  sealed trait cornsilk
    extends StObject
       with NamedColor
  @scala.inline
  def cornsilk: cornsilk = "cornsilk".asInstanceOf[cornsilk]
  
  @js.native
  sealed trait cover
    extends StObject
       with ObjectFit
       with ViewportFit
       with _BgSize[Any]
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait crimson
    extends StObject
       with NamedColor
  @scala.inline
  def crimson: crimson = "crimson".asInstanceOf[crimson]
  
  @js.native
  sealed trait `crisp-edges`
    extends StObject
       with ImageRendering
  @scala.inline
  def `crisp-edges`: `crisp-edges` = "crisp-edges".asInstanceOf[`crisp-edges`]
  
  @js.native
  sealed trait crispEdges
    extends StObject
       with ShapeRendering
  @scala.inline
  def crispEdges: crispEdges = "crispEdges".asInstanceOf[crispEdges]
  
  @js.native
  sealed trait crop
    extends StObject
       with _Marks
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait cross
    extends StObject
       with _Marks
  @scala.inline
  def cross: cross = "cross".asInstanceOf[cross]
  
  @js.native
  sealed trait crosshair
    extends StObject
       with _Cursor
  @scala.inline
  def crosshair: crosshair = "crosshair".asInstanceOf[crosshair]
  
  @js.native
  sealed trait currentColor
    extends StObject
       with _FloodColor
       with _LightingColor
       with _StopColor
  @scala.inline
  def currentColor: currentColor = "currentColor".asInstanceOf[currentColor]
  
  @js.native
  sealed trait currentcolor_
    extends StObject
       with _Color
  @scala.inline
  def currentcolor_ : currentcolor_ = "currentcolor".asInstanceOf[currentcolor_]
  
  @js.native
  sealed trait cursive
    extends StObject
       with GenericFamily
  @scala.inline
  def cursive: cursive = "cursive".asInstanceOf[cursive]
  
  @js.native
  sealed trait cyan
    extends StObject
       with NamedColor
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait cyclic
    extends StObject
       with _System
  @scala.inline
  def cyclic: cyclic = "cyclic".asInstanceOf[cyclic]
  
  @js.native
  sealed trait dark
    extends StObject
       with _ColorScheme
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait darkblue
    extends StObject
       with NamedColor
  @scala.inline
  def darkblue: darkblue = "darkblue".asInstanceOf[darkblue]
  
  @js.native
  sealed trait darkcyan
    extends StObject
       with NamedColor
  @scala.inline
  def darkcyan: darkcyan = "darkcyan".asInstanceOf[darkcyan]
  
  @js.native
  sealed trait darken
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def darken: darken = "darken".asInstanceOf[darken]
  
  @js.native
  sealed trait darkgoldenrod
    extends StObject
       with NamedColor
  @scala.inline
  def darkgoldenrod: darkgoldenrod = "darkgoldenrod".asInstanceOf[darkgoldenrod]
  
  @js.native
  sealed trait darkgray
    extends StObject
       with NamedColor
  @scala.inline
  def darkgray: darkgray = "darkgray".asInstanceOf[darkgray]
  
  @js.native
  sealed trait darkgreen
    extends StObject
       with NamedColor
  @scala.inline
  def darkgreen: darkgreen = "darkgreen".asInstanceOf[darkgreen]
  
  @js.native
  sealed trait darkgrey
    extends StObject
       with NamedColor
  @scala.inline
  def darkgrey: darkgrey = "darkgrey".asInstanceOf[darkgrey]
  
  @js.native
  sealed trait darkkhaki
    extends StObject
       with NamedColor
  @scala.inline
  def darkkhaki: darkkhaki = "darkkhaki".asInstanceOf[darkkhaki]
  
  @js.native
  sealed trait darkmagenta
    extends StObject
       with NamedColor
  @scala.inline
  def darkmagenta: darkmagenta = "darkmagenta".asInstanceOf[darkmagenta]
  
  @js.native
  sealed trait darkolivegreen
    extends StObject
       with NamedColor
  @scala.inline
  def darkolivegreen: darkolivegreen = "darkolivegreen".asInstanceOf[darkolivegreen]
  
  @js.native
  sealed trait darkorange
    extends StObject
       with NamedColor
  @scala.inline
  def darkorange: darkorange = "darkorange".asInstanceOf[darkorange]
  
  @js.native
  sealed trait darkorchid
    extends StObject
       with NamedColor
  @scala.inline
  def darkorchid: darkorchid = "darkorchid".asInstanceOf[darkorchid]
  
  @js.native
  sealed trait darkred
    extends StObject
       with NamedColor
  @scala.inline
  def darkred: darkred = "darkred".asInstanceOf[darkred]
  
  @js.native
  sealed trait darksalmon
    extends StObject
       with NamedColor
  @scala.inline
  def darksalmon: darksalmon = "darksalmon".asInstanceOf[darksalmon]
  
  @js.native
  sealed trait darkseagreen
    extends StObject
       with NamedColor
  @scala.inline
  def darkseagreen: darkseagreen = "darkseagreen".asInstanceOf[darkseagreen]
  
  @js.native
  sealed trait darkslateblue
    extends StObject
       with NamedColor
  @scala.inline
  def darkslateblue: darkslateblue = "darkslateblue".asInstanceOf[darkslateblue]
  
  @js.native
  sealed trait darkslategray
    extends StObject
       with NamedColor
  @scala.inline
  def darkslategray: darkslategray = "darkslategray".asInstanceOf[darkslategray]
  
  @js.native
  sealed trait darkslategrey
    extends StObject
       with NamedColor
  @scala.inline
  def darkslategrey: darkslategrey = "darkslategrey".asInstanceOf[darkslategrey]
  
  @js.native
  sealed trait darkturquoise
    extends StObject
       with NamedColor
  @scala.inline
  def darkturquoise: darkturquoise = "darkturquoise".asInstanceOf[darkturquoise]
  
  @js.native
  sealed trait darkviolet
    extends StObject
       with NamedColor
  @scala.inline
  def darkviolet: darkviolet = "darkviolet".asInstanceOf[darkviolet]
  
  @js.native
  sealed trait dashed
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  @scala.inline
  def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait deeppink
    extends StObject
       with NamedColor
  @scala.inline
  def deeppink: deeppink = "deeppink".asInstanceOf[deeppink]
  
  @js.native
  sealed trait deepskyblue
    extends StObject
       with NamedColor
  @scala.inline
  def deepskyblue: deepskyblue = "deepskyblue".asInstanceOf[deepskyblue]
  
  @js.native
  sealed trait `default-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `default-button`: `default-button` = "default-button".asInstanceOf[`default-button`]
  
  @js.native
  sealed trait dense
    extends StObject
       with _GridAutoFlow
  @scala.inline
  def dense: dense = "dense".asInstanceOf[dense]
  
  @js.native
  sealed trait `destination-atop`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `destination-atop`: `destination-atop` = "destination-atop".asInstanceOf[`destination-atop`]
  
  @js.native
  sealed trait `destination-in`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `destination-in`: `destination-in` = "destination-in".asInstanceOf[`destination-in`]
  
  @js.native
  sealed trait `destination-out`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `destination-out`: `destination-out` = "destination-out".asInstanceOf[`destination-out`]
  
  @js.native
  sealed trait `destination-over`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `destination-over`: `destination-over` = "destination-over".asInstanceOf[`destination-over`]
  
  @js.native
  sealed trait `diagonal-fractions`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `diagonal-fractions`: `diagonal-fractions` = "diagonal-fractions".asInstanceOf[`diagonal-fractions`]
  
  @js.native
  sealed trait difference
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def difference: difference = "difference".asInstanceOf[difference]
  
  @js.native
  sealed trait dimgray
    extends StObject
       with NamedColor
  @scala.inline
  def dimgray: dimgray = "dimgray".asInstanceOf[dimgray]
  
  @js.native
  sealed trait dimgrey
    extends StObject
       with NamedColor
  @scala.inline
  def dimgrey: dimgrey = "dimgrey".asInstanceOf[dimgrey]
  
  @js.native
  sealed trait disabled
    extends StObject
       with ImeMode
       with MozUserInput
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait `discretionary-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `discretionary-ligatures`: `discretionary-ligatures` = "discretionary-ligatures".asInstanceOf[`discretionary-ligatures`]
  
  @js.native
  sealed trait dodgerblue
    extends StObject
       with NamedColor
  @scala.inline
  def dodgerblue: dodgerblue = "dodgerblue".asInstanceOf[dodgerblue]
  
  @js.native
  sealed trait dot
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  
  @js.native
  sealed trait dotted
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  @scala.inline
  def dotted: dotted = "dotted".asInstanceOf[dotted]
  
  @js.native
  sealed trait double
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait `double-circle`
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def `double-circle`: `double-circle` = "double-circle".asInstanceOf[`double-circle`]
  
  @js.native
  sealed trait drag
    extends StObject
       with MozWindowDragging
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dualbutton
    extends StObject
       with MozAppearance
  @scala.inline
  def dualbutton: dualbutton = "dualbutton".asInstanceOf[dualbutton]
  
  @js.native
  sealed trait `e-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `e-resize`: `e-resize` = "e-resize".asInstanceOf[`e-resize`]
  
  @js.native
  sealed trait ease
    extends StObject
       with _CubicBezierTimingFunction
  @scala.inline
  def ease: ease = "ease".asInstanceOf[ease]
  
  @js.native
  sealed trait `ease-in`
    extends StObject
       with _CubicBezierTimingFunction
  @scala.inline
  def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  
  @js.native
  sealed trait `ease-in-out`
    extends StObject
       with _CubicBezierTimingFunction
  @scala.inline
  def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  
  @js.native
  sealed trait `ease-out`
    extends StObject
       with _CubicBezierTimingFunction
  @scala.inline
  def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  
  @js.native
  sealed trait economy
    extends StObject
       with ColorAdjust
  @scala.inline
  def economy: economy = "economy".asInstanceOf[economy]
  
  @js.native
  sealed trait edges
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  
  @js.native
  sealed trait element
    extends StObject
       with MsUserSelect
       with UserSelect
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait ellipsis
    extends StObject
       with _BlockOverflow
       with _TextOverflow
  @scala.inline
  def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  
  @js.native
  sealed trait embed
    extends StObject
       with UnicodeBidi
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait enabled
    extends StObject
       with MozUserInput
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait end
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait evenodd
    extends StObject
       with ClipRule
       with FillRule
  @scala.inline
  def evenodd: evenodd = "evenodd".asInstanceOf[evenodd]
  
  @js.native
  sealed trait `ew-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `ew-resize`: `ew-resize` = "ew-resize".asInstanceOf[`ew-resize`]
  
  @js.native
  sealed trait exact
    extends StObject
       with ColorAdjust
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  
  @js.native
  sealed trait exclude
    extends StObject
       with CompositingOperator
  @scala.inline
  def exclude: exclude = "exclude".asInstanceOf[exclude]
  
  @js.native
  sealed trait exclusion
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def exclusion: exclusion = "exclusion".asInstanceOf[exclusion]
  
  @js.native
  sealed trait expanded
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait `extra-condensed`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `extra-condensed`: `extra-condensed` = "extra-condensed".asInstanceOf[`extra-condensed`]
  
  @js.native
  sealed trait `extra-expanded`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `extra-expanded`: `extra-expanded` = "extra-expanded".asInstanceOf[`extra-expanded`]
  
  @js.native
  sealed trait fallback_
    extends StObject
       with FontDisplay
  @scala.inline
  def fallback_ : fallback_ = "fallback".asInstanceOf[fallback_]
  
  @js.native
  sealed trait `false`
    extends StObject
       with Inherits
       with MsAccelerator
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait fantasy
    extends StObject
       with GenericFamily
  @scala.inline
  def fantasy: fantasy = "fantasy".asInstanceOf[fantasy]
  
  @js.native
  sealed trait `far-left`
    extends StObject
       with _Azimuth
  @scala.inline
  def `far-left`: `far-left` = "far-left".asInstanceOf[`far-left`]
  
  @js.native
  sealed trait `far-right`
    extends StObject
       with _Azimuth
  @scala.inline
  def `far-right`: `far-right` = "far-right".asInstanceOf[`far-right`]
  
  @js.native
  sealed trait fill
    extends StObject
       with ObjectFit
       with PointerEvents
       with _MozContextProperties
       with _PaintOrder
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait `fill-box`
    extends StObject
       with GeometryBox
       with TransformBox
  @scala.inline
  def `fill-box`: `fill-box` = "fill-box".asInstanceOf[`fill-box`]
  
  @js.native
  sealed trait `fill-opacity`
    extends StObject
       with _MozContextProperties
  @scala.inline
  def `fill-opacity`: `fill-opacity` = "fill-opacity".asInstanceOf[`fill-opacity`]
  
  @js.native
  sealed trait filled
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def filled: filled = "filled".asInstanceOf[filled]
  
  @js.native
  sealed trait firebrick
    extends StObject
       with NamedColor
  @scala.inline
  def firebrick: firebrick = "firebrick".asInstanceOf[firebrick]
  
  @js.native
  sealed trait first
    extends StObject
       with _HangingPunctuation
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait `fit-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `fit-content`: `fit-content` = "fit-content".asInstanceOf[`fit-content`]
  
  @js.native
  sealed trait fixed
    extends StObject
       with Attachment
       with Position
       with TableLayout
       with UserZoom
       with _System
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait flat
    extends StObject
       with TransformStyle
  @scala.inline
  def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait flex
    extends StObject
       with DisplayInside
  @scala.inline
  def flex: flex = "flex".asInstanceOf[flex]
  
  @js.native
  sealed trait `flex-end`
    extends StObject
       with ContentPosition
       with SelfPosition
  @scala.inline
  def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  
  @js.native
  sealed trait `flex-start`
    extends StObject
       with ContentPosition
       with SelfPosition
  @scala.inline
  def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @js.native
  sealed trait flip
    extends StObject
       with _ImageOrientation
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait floralwhite
    extends StObject
       with NamedColor
  @scala.inline
  def floralwhite: floralwhite = "floralwhite".asInstanceOf[floralwhite]
  
  @js.native
  sealed trait flow
    extends StObject
       with DisplayInside
  @scala.inline
  def flow: flow = "flow".asInstanceOf[flow]
  
  @js.native
  sealed trait `flow-root`
    extends StObject
       with DisplayInside
  @scala.inline
  def `flow-root`: `flow-root` = "flow-root".asInstanceOf[`flow-root`]
  
  @js.native
  sealed trait `force-end`
    extends StObject
       with _HangingPunctuation
  @scala.inline
  def `force-end`: `force-end` = "force-end".asInstanceOf[`force-end`]
  
  @js.native
  sealed trait forestgreen
    extends StObject
       with NamedColor
  @scala.inline
  def forestgreen: forestgreen = "forestgreen".asInstanceOf[forestgreen]
  
  @js.native
  sealed trait forwards
    extends StObject
       with SingleAnimationFillMode
  @scala.inline
  def forwards: forwards = "forwards".asInstanceOf[forwards]
  
  @js.native
  sealed trait `from-font`
    extends StObject
       with _FontSizeAdjust
       with _TextDecoration[Any]
       with _TextDecorationThickness[Any]
       with _TextUnderlinePosition
  @scala.inline
  def `from-font`: `from-font` = "from-font".asInstanceOf[`from-font`]
  
  @js.native
  sealed trait `from-image`
    extends StObject
       with _ImageOrientation
       with _ImageResolution
  @scala.inline
  def `from-image`: `from-image` = "from-image".asInstanceOf[`from-image`]
  
  @js.native
  sealed trait fuchsia
    extends StObject
       with NamedColor
  @scala.inline
  def fuchsia: fuchsia = "fuchsia".asInstanceOf[fuchsia]
  
  @js.native
  sealed trait `full-size-kana`
    extends StObject
       with TextTransform
  @scala.inline
  def `full-size-kana`: `full-size-kana` = "full-size-kana".asInstanceOf[`full-size-kana`]
  
  @js.native
  sealed trait `full-width`
    extends StObject
       with TextTransform
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  @scala.inline
  def `full-width`: `full-width` = "full-width".asInstanceOf[`full-width`]
  
  @js.native
  sealed trait gainsboro
    extends StObject
       with NamedColor
  @scala.inline
  def gainsboro: gainsboro = "gainsboro".asInstanceOf[gainsboro]
  
  @js.native
  sealed trait geometricPrecision
    extends StObject
       with ShapeRendering
       with TextRendering
  @scala.inline
  def geometricPrecision: geometricPrecision = "geometricPrecision".asInstanceOf[geometricPrecision]
  
  @js.native
  sealed trait ghostwhite
    extends StObject
       with NamedColor
  @scala.inline
  def ghostwhite: ghostwhite = "ghostwhite".asInstanceOf[ghostwhite]
  
  @js.native
  sealed trait gold
    extends StObject
       with NamedColor
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait goldenrod
    extends StObject
       with NamedColor
  @scala.inline
  def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  
  @js.native
  sealed trait grab
    extends StObject
       with _Cursor
  @scala.inline
  def grab: grab = "grab".asInstanceOf[grab]
  
  @js.native
  sealed trait grabbing
    extends StObject
       with _Cursor
  @scala.inline
  def grabbing: grabbing = "grabbing".asInstanceOf[grabbing]
  
  @js.native
  sealed trait `grammar-error`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def `grammar-error`: `grammar-error` = "grammar-error".asInstanceOf[`grammar-error`]
  
  @js.native
  sealed trait gray
    extends StObject
       with NamedColor
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  
  @js.native
  sealed trait green
    extends StObject
       with NamedColor
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait greenyellow
    extends StObject
       with NamedColor
  @scala.inline
  def greenyellow: greenyellow = "greenyellow".asInstanceOf[greenyellow]
  
  @js.native
  sealed trait grey
    extends StObject
       with NamedColor
  @scala.inline
  def grey: grey = "grey".asInstanceOf[grey]
  
  @js.native
  sealed trait grid
    extends StObject
       with DisplayInside
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait grippers
    extends StObject
       with MsTouchSelect
  @scala.inline
  def grippers: grippers = "grippers".asInstanceOf[grippers]
  
  @js.native
  sealed trait groove
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  @scala.inline
  def groove: groove = "groove".asInstanceOf[groove]
  
  @js.native
  sealed trait groupbox
    extends StObject
       with MozAppearance
  @scala.inline
  def groupbox: groupbox = "groupbox".asInstanceOf[groupbox]
  
  @js.native
  sealed trait hanging
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def hanging: hanging = "hanging".asInstanceOf[hanging]
  
  @js.native
  sealed trait `hard-light`
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def `hard-light`: `hard-light` = "hard-light".asInstanceOf[`hard-light`]
  
  @js.native
  sealed trait help
    extends StObject
       with _Cursor
  @scala.inline
  def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait hidden
    extends StObject
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with ContentVisibility
       with LineStyle
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with Visibility
       with _Overflow
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hide
    extends StObject
       with EmptyCells
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait `historical-forms`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantAlternates
  @scala.inline
  def `historical-forms`: `historical-forms` = "historical-forms".asInstanceOf[`historical-forms`]
  
  @js.native
  sealed trait `historical-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `historical-ligatures`: `historical-ligatures` = "historical-ligatures".asInstanceOf[`historical-ligatures`]
  
  @js.native
  sealed trait honeydew
    extends StObject
       with NamedColor
  @scala.inline
  def honeydew: honeydew = "honeydew".asInstanceOf[honeydew]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with BoxOrient
       with MozOrient
       with Resize
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait `horizontal-tb`
    extends StObject
       with WritingMode
  @scala.inline
  def `horizontal-tb`: `horizontal-tb` = "horizontal-tb".asInstanceOf[`horizontal-tb`]
  
  @js.native
  sealed trait hotpink
    extends StObject
       with NamedColor
  @scala.inline
  def hotpink: hotpink = "hotpink".asInstanceOf[hotpink]
  
  @js.native
  sealed trait hue
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def hue: hue = "hue".asInstanceOf[hue]
  
  @js.native
  sealed trait icon
    extends StObject
       with _Font
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait `ideograph-alpha`
    extends StObject
       with MsTextAutospace
  @scala.inline
  def `ideograph-alpha`: `ideograph-alpha` = "ideograph-alpha".asInstanceOf[`ideograph-alpha`]
  
  @js.native
  sealed trait `ideograph-numeric`
    extends StObject
       with MsTextAutospace
  @scala.inline
  def `ideograph-numeric`: `ideograph-numeric` = "ideograph-numeric".asInstanceOf[`ideograph-numeric`]
  
  @js.native
  sealed trait `ideograph-parenthesis`
    extends StObject
       with MsTextAutospace
  @scala.inline
  def `ideograph-parenthesis`: `ideograph-parenthesis` = "ideograph-parenthesis".asInstanceOf[`ideograph-parenthesis`]
  
  @js.native
  sealed trait `ideograph-space`
    extends StObject
       with MsTextAutospace
  @scala.inline
  def `ideograph-space`: `ideograph-space` = "ideograph-space".asInstanceOf[`ideograph-space`]
  
  @js.native
  sealed trait ideographic
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def ideographic: ideographic = "ideographic".asInstanceOf[ideographic]
  
  @js.native
  sealed trait ignore
    extends StObject
       with MozStackSizing
       with MozUserFocus
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait inactive
    extends StObject
       with ImeMode
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait indianred
    extends StObject
       with NamedColor
  @scala.inline
  def indianred: indianred = "indianred".asInstanceOf[indianred]
  
  @js.native
  sealed trait indigo
    extends StObject
       with NamedColor
  @scala.inline
  def indigo: indigo = "indigo".asInstanceOf[indigo]
  
  @js.native
  sealed trait infinite
    extends StObject
       with _AnimationIterationCount
       with _SingleAnimation[Any]
  @scala.inline
  def infinite: infinite = "infinite".asInstanceOf[infinite]
  
  @js.native
  sealed trait inherit
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with DisplayOutside
       with MozOrient
       with Resize
       with _ScrollSnapType
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait `inline-axis`
    extends StObject
       with BoxOrient
  @scala.inline
  def `inline-axis`: `inline-axis` = "inline-axis".asInstanceOf[`inline-axis`]
  
  @js.native
  sealed trait `inline-block`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  
  @js.native
  sealed trait `inline-end`
    extends StObject
       with CaptionSide
       with Clear
       with Float
  @scala.inline
  def `inline-end`: `inline-end` = "inline-end".asInstanceOf[`inline-end`]
  
  @js.native
  sealed trait `inline-flex`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `inline-flex`: `inline-flex` = "inline-flex".asInstanceOf[`inline-flex`]
  
  @js.native
  sealed trait `inline-grid`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `inline-grid`: `inline-grid` = "inline-grid".asInstanceOf[`inline-grid`]
  
  @js.native
  sealed trait `inline-list-item`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `inline-list-item`: `inline-list-item` = "inline-list-item".asInstanceOf[`inline-list-item`]
  
  @js.native
  sealed trait `inline-start`
    extends StObject
       with CaptionSide
       with Clear
       with Float
  @scala.inline
  def `inline-start`: `inline-start` = "inline-start".asInstanceOf[`inline-start`]
  
  @js.native
  sealed trait `inline-table`
    extends StObject
       with DisplayLegacy
  @scala.inline
  def `inline-table`: `inline-table` = "inline-table".asInstanceOf[`inline-table`]
  
  @js.native
  sealed trait `inner-spin-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `inner-spin-button`: `inner-spin-button` = "inner-spin-button".asInstanceOf[`inner-spin-button`]
  
  @js.native
  sealed trait inset
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  @scala.inline
  def inset: inset = "inset".asInstanceOf[inset]
  
  @js.native
  sealed trait inside
    extends StObject
       with ListStylePosition
       with _ListStyle
  @scala.inline
  def inside: inside = "inside".asInstanceOf[inside]
  
  @js.native
  sealed trait `inter-character`
    extends StObject
       with TextJustify
       with _RubyPosition
  @scala.inline
  def `inter-character`: `inter-character` = "inter-character".asInstanceOf[`inter-character`]
  
  @js.native
  sealed trait `inter-word`
    extends StObject
       with TextJustify
  @scala.inline
  def `inter-word`: `inter-word` = "inter-word".asInstanceOf[`inter-word`]
  
  @js.native
  sealed trait intersect
    extends StObject
       with CompositingOperator
  @scala.inline
  def intersect: intersect = "intersect".asInstanceOf[intersect]
  
  @js.native
  sealed trait intrinsic
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def intrinsic: intrinsic = "intrinsic".asInstanceOf[intrinsic]
  
  @js.native
  sealed trait invert
    extends StObject
       with _Outline[Any]
       with _OutlineColor
  @scala.inline
  def invert: invert = "invert".asInstanceOf[invert]
  
  @js.native
  sealed trait isolate
    extends StObject
       with Isolation
       with UnicodeBidi
  @scala.inline
  def isolate: isolate = "isolate".asInstanceOf[isolate]
  
  @js.native
  sealed trait `isolate-override`
    extends StObject
       with UnicodeBidi
  @scala.inline
  def `isolate-override`: `isolate-override` = "isolate-override".asInstanceOf[`isolate-override`]
  
  @js.native
  sealed trait italic
    extends StObject
       with _FontStyle
       with com.olvind.mui.csstype.mod.AtRule._FontStyle
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait ivory
    extends StObject
       with NamedColor
  @scala.inline
  def ivory: ivory = "ivory".asInstanceOf[ivory]
  
  @js.native
  sealed trait jis04
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def jis04: jis04 = "jis04".asInstanceOf[jis04]
  
  @js.native
  sealed trait jis78
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def jis78: jis78 = "jis78".asInstanceOf[jis78]
  
  @js.native
  sealed trait jis83
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def jis83: jis83 = "jis83".asInstanceOf[jis83]
  
  @js.native
  sealed trait jis90
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def jis90: jis90 = "jis90".asInstanceOf[jis90]
  
  @js.native
  sealed trait justify
    extends StObject
       with BoxPack
       with TextAlign
       with TextAlignLast
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait `keep-all`
    extends StObject
       with WordBreak
  @scala.inline
  def `keep-all`: `keep-all` = "keep-all".asInstanceOf[`keep-all`]
  
  @js.native
  sealed trait khaki
    extends StObject
       with NamedColor
  @scala.inline
  def khaki: khaki = "khaki".asInstanceOf[khaki]
  
  @js.native
  sealed trait landscape
    extends StObject
       with Orientation
       with _Size[Any]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait large
    extends StObject
       with AbsoluteSize
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait larger
    extends StObject
       with _FontSize[Any]
  @scala.inline
  def larger: larger = "larger".asInstanceOf[larger]
  
  @js.native
  sealed trait last
    extends StObject
       with _HangingPunctuation
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait lavender
    extends StObject
       with NamedColor
  @scala.inline
  def lavender: lavender = "lavender".asInstanceOf[lavender]
  
  @js.native
  sealed trait lavenderblush
    extends StObject
       with NamedColor
  @scala.inline
  def lavenderblush: lavenderblush = "lavenderblush".asInstanceOf[lavenderblush]
  
  @js.native
  sealed trait lawngreen
    extends StObject
       with NamedColor
  @scala.inline
  def lawngreen: lawngreen = "lawngreen".asInstanceOf[lawngreen]
  
  @js.native
  sealed trait layout
    extends StObject
       with _Contain
  @scala.inline
  def layout: layout = "layout".asInstanceOf[layout]
  
  @js.native
  sealed trait `leading-spaces`
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def `leading-spaces`: `leading-spaces` = "leading-spaces".asInstanceOf[`leading-spaces`]
  
  @js.native
  sealed trait ledger
    extends StObject
       with PageSize
  @scala.inline
  def ledger: ledger = "ledger".asInstanceOf[ledger]
  
  @js.native
  sealed trait left
    extends StObject
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BgPosition[Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _Position[Any]
       with _TextUnderlinePosition
       with _TransformOrigin[Any]
       with _WebkitBoxReflect[Any]
       with _WebkitMaskPositionX[Any]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-side`
    extends StObject
       with _Azimuth
  @scala.inline
  def `left-side`: `left-side` = "left-side".asInstanceOf[`left-side`]
  
  @js.native
  sealed trait leftwards
    extends StObject
       with _Azimuth
  @scala.inline
  def leftwards: leftwards = "leftwards".asInstanceOf[leftwards]
  
  @js.native
  sealed trait legacy
    extends StObject
       with _JustifyItems
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait legal
    extends StObject
       with PageSize
  @scala.inline
  def legal: legal = "legal".asInstanceOf[legal]
  
  @js.native
  sealed trait lemonchiffon
    extends StObject
       with NamedColor
  @scala.inline
  def lemonchiffon: lemonchiffon = "lemonchiffon".asInstanceOf[lemonchiffon]
  
  @js.native
  sealed trait letter
    extends StObject
       with PageSize
  @scala.inline
  def letter: letter = "letter".asInstanceOf[letter]
  
  @js.native
  sealed trait light
    extends StObject
       with _ColorScheme
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait lightblue
    extends StObject
       with NamedColor
  @scala.inline
  def lightblue: lightblue = "lightblue".asInstanceOf[lightblue]
  
  @js.native
  sealed trait lightcoral
    extends StObject
       with NamedColor
  @scala.inline
  def lightcoral: lightcoral = "lightcoral".asInstanceOf[lightcoral]
  
  @js.native
  sealed trait lightcyan
    extends StObject
       with NamedColor
  @scala.inline
  def lightcyan: lightcyan = "lightcyan".asInstanceOf[lightcyan]
  
  @js.native
  sealed trait lighten
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def lighten: lighten = "lighten".asInstanceOf[lighten]
  
  @js.native
  sealed trait lighter
    extends StObject
       with _FontWeight
  @scala.inline
  def lighter: lighter = "lighter".asInstanceOf[lighter]
  
  @js.native
  sealed trait lightgoldenrodyellow
    extends StObject
       with NamedColor
  @scala.inline
  def lightgoldenrodyellow: lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[lightgoldenrodyellow]
  
  @js.native
  sealed trait lightgray
    extends StObject
       with NamedColor
  @scala.inline
  def lightgray: lightgray = "lightgray".asInstanceOf[lightgray]
  
  @js.native
  sealed trait lightgreen
    extends StObject
       with NamedColor
  @scala.inline
  def lightgreen: lightgreen = "lightgreen".asInstanceOf[lightgreen]
  
  @js.native
  sealed trait lightgrey
    extends StObject
       with NamedColor
  @scala.inline
  def lightgrey: lightgrey = "lightgrey".asInstanceOf[lightgrey]
  
  @js.native
  sealed trait lightpink
    extends StObject
       with NamedColor
  @scala.inline
  def lightpink: lightpink = "lightpink".asInstanceOf[lightpink]
  
  @js.native
  sealed trait lightsalmon
    extends StObject
       with NamedColor
  @scala.inline
  def lightsalmon: lightsalmon = "lightsalmon".asInstanceOf[lightsalmon]
  
  @js.native
  sealed trait lightseagreen
    extends StObject
       with NamedColor
  @scala.inline
  def lightseagreen: lightseagreen = "lightseagreen".asInstanceOf[lightseagreen]
  
  @js.native
  sealed trait lightskyblue
    extends StObject
       with NamedColor
  @scala.inline
  def lightskyblue: lightskyblue = "lightskyblue".asInstanceOf[lightskyblue]
  
  @js.native
  sealed trait lightslategray
    extends StObject
       with NamedColor
  @scala.inline
  def lightslategray: lightslategray = "lightslategray".asInstanceOf[lightslategray]
  
  @js.native
  sealed trait lightslategrey
    extends StObject
       with NamedColor
  @scala.inline
  def lightslategrey: lightslategrey = "lightslategrey".asInstanceOf[lightslategrey]
  
  @js.native
  sealed trait lightsteelblue
    extends StObject
       with NamedColor
  @scala.inline
  def lightsteelblue: lightsteelblue = "lightsteelblue".asInstanceOf[lightsteelblue]
  
  @js.native
  sealed trait lightyellow
    extends StObject
       with NamedColor
  @scala.inline
  def lightyellow: lightyellow = "lightyellow".asInstanceOf[lightyellow]
  
  @js.native
  sealed trait lime
    extends StObject
       with NamedColor
  @scala.inline
  def lime: lime = "lime".asInstanceOf[lime]
  
  @js.native
  sealed trait limegreen
    extends StObject
       with NamedColor
  @scala.inline
  def limegreen: limegreen = "limegreen".asInstanceOf[limegreen]
  
  @js.native
  sealed trait `line-through`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def `line-through`: `line-through` = "line-through".asInstanceOf[`line-through`]
  
  @js.native
  sealed trait linear
    extends StObject
       with _EasingFunction
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait linearRGB
    extends StObject
       with ColorInterpolation
  @scala.inline
  def linearRGB: linearRGB = "linearRGB".asInstanceOf[linearRGB]
  
  @js.native
  sealed trait linen
    extends StObject
       with NamedColor
  @scala.inline
  def linen: linen = "linen".asInstanceOf[linen]
  
  @js.native
  sealed trait `lining-nums`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `lining-nums`: `lining-nums` = "lining-nums".asInstanceOf[`lining-nums`]
  
  @js.native
  sealed trait `list-item`
    extends StObject
       with _Display
  @scala.inline
  def `list-item`: `list-item` = "list-item".asInstanceOf[`list-item`]
  
  @js.native
  sealed trait listbox
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def listbox: listbox = "listbox".asInstanceOf[listbox]
  
  @js.native
  sealed trait listitem
    extends StObject
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def listitem: listitem = "listitem".asInstanceOf[listitem]
  
  @js.native
  sealed trait local
    extends StObject
       with Attachment
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait loose
    extends StObject
       with LineBreak
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait lowercase
    extends StObject
       with TextTransform
  @scala.inline
  def lowercase: lowercase = "lowercase".asInstanceOf[lowercase]
  
  @js.native
  sealed trait lr
    extends StObject
       with MsBlockProgression
  @scala.inline
  def lr: lr = "lr".asInstanceOf[lr]
  
  @js.native
  sealed trait ltr
    extends StObject
       with Direction
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait luminance
    extends StObject
       with MaskBorderMode
       with MaskType
       with MaskingMode
       with _MaskBorder
  @scala.inline
  def luminance: luminance = "luminance".asInstanceOf[luminance]
  
  @js.native
  sealed trait luminosity
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def luminosity: luminosity = "luminosity".asInstanceOf[luminosity]
  
  @js.native
  sealed trait magenta
    extends StObject
       with NamedColor
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait mandatory
    extends StObject
       with MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  @scala.inline
  def mandatory: mandatory = "mandatory".asInstanceOf[mandatory]
  
  @js.native
  sealed trait manipulation
    extends StObject
       with _TouchAction
  @scala.inline
  def manipulation: manipulation = "manipulation".asInstanceOf[manipulation]
  
  @js.native
  sealed trait manual
    extends StObject
       with Hyphens
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait `margin-box`
    extends StObject
       with GeometryBox
       with MozFloatEdge
       with _ShapeOutside
  @scala.inline
  def `margin-box`: `margin-box` = "margin-box".asInstanceOf[`margin-box`]
  
  @js.native
  sealed trait markers
    extends StObject
       with _PaintOrder
  @scala.inline
  def markers: markers = "markers".asInstanceOf[markers]
  
  @js.native
  sealed trait maroon
    extends StObject
       with NamedColor
  @scala.inline
  def maroon: maroon = "maroon".asInstanceOf[maroon]
  
  @js.native
  sealed trait `match-parent`
    extends StObject
       with TextAlign
  @scala.inline
  def `match-parent`: `match-parent` = "match-parent".asInstanceOf[`match-parent`]
  
  @js.native
  sealed trait `match-source`
    extends StObject
       with MaskingMode
  @scala.inline
  def `match-source`: `match-source` = "match-source".asInstanceOf[`match-source`]
  
  @js.native
  sealed trait mathematical
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def mathematical: mathematical = "mathematical".asInstanceOf[mathematical]
  
  @js.native
  sealed trait `max-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _TrackBreadth[Any]
       with _Width[Any]
  @scala.inline
  def `max-content`: `max-content` = "max-content".asInstanceOf[`max-content`]
  
  @js.native
  sealed trait maximum
    extends StObject
       with MsWrapFlow
  @scala.inline
  def maximum: maximum = "maximum".asInstanceOf[maximum]
  
  @js.native
  sealed trait `media-controls-background`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-controls-background`: `media-controls-background` = "media-controls-background".asInstanceOf[`media-controls-background`]
  
  @js.native
  sealed trait `media-controls-fullscreen-background`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-controls-fullscreen-background`: `media-controls-fullscreen-background` = "media-controls-fullscreen-background".asInstanceOf[`media-controls-fullscreen-background`]
  
  @js.native
  sealed trait `media-current-time-display`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-current-time-display`: `media-current-time-display` = "media-current-time-display".asInstanceOf[`media-current-time-display`]
  
  @js.native
  sealed trait `media-enter-fullscreen-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-enter-fullscreen-button`: `media-enter-fullscreen-button` = "media-enter-fullscreen-button".asInstanceOf[`media-enter-fullscreen-button`]
  
  @js.native
  sealed trait `media-exit-fullscreen-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-exit-fullscreen-button`: `media-exit-fullscreen-button` = "media-exit-fullscreen-button".asInstanceOf[`media-exit-fullscreen-button`]
  
  @js.native
  sealed trait `media-fullscreen-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-fullscreen-button`: `media-fullscreen-button` = "media-fullscreen-button".asInstanceOf[`media-fullscreen-button`]
  
  @js.native
  sealed trait `media-mute-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-mute-button`: `media-mute-button` = "media-mute-button".asInstanceOf[`media-mute-button`]
  
  @js.native
  sealed trait `media-overlay-play-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-overlay-play-button`: `media-overlay-play-button` = "media-overlay-play-button".asInstanceOf[`media-overlay-play-button`]
  
  @js.native
  sealed trait `media-play-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-play-button`: `media-play-button` = "media-play-button".asInstanceOf[`media-play-button`]
  
  @js.native
  sealed trait `media-seek-back-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-seek-back-button`: `media-seek-back-button` = "media-seek-back-button".asInstanceOf[`media-seek-back-button`]
  
  @js.native
  sealed trait `media-seek-forward-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-seek-forward-button`: `media-seek-forward-button` = "media-seek-forward-button".asInstanceOf[`media-seek-forward-button`]
  
  @js.native
  sealed trait `media-slider`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-slider`: `media-slider` = "media-slider".asInstanceOf[`media-slider`]
  
  @js.native
  sealed trait `media-sliderthumb`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-sliderthumb`: `media-sliderthumb` = "media-sliderthumb".asInstanceOf[`media-sliderthumb`]
  
  @js.native
  sealed trait `media-time-remaining-display`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-time-remaining-display`: `media-time-remaining-display` = "media-time-remaining-display".asInstanceOf[`media-time-remaining-display`]
  
  @js.native
  sealed trait `media-toggle-closed-captions-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-toggle-closed-captions-button`: `media-toggle-closed-captions-button` = "media-toggle-closed-captions-button".asInstanceOf[`media-toggle-closed-captions-button`]
  
  @js.native
  sealed trait `media-volume-slider`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-volume-slider`: `media-volume-slider` = "media-volume-slider".asInstanceOf[`media-volume-slider`]
  
  @js.native
  sealed trait `media-volume-slider-container`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-volume-slider-container`: `media-volume-slider-container` = "media-volume-slider-container".asInstanceOf[`media-volume-slider-container`]
  
  @js.native
  sealed trait `media-volume-sliderthumb`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `media-volume-sliderthumb`: `media-volume-sliderthumb` = "media-volume-sliderthumb".asInstanceOf[`media-volume-sliderthumb`]
  
  @js.native
  sealed trait medium
    extends StObject
       with AbsoluteSize
       with _LineWidth[Any]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait mediumaquamarine
    extends StObject
       with NamedColor
  @scala.inline
  def mediumaquamarine: mediumaquamarine = "mediumaquamarine".asInstanceOf[mediumaquamarine]
  
  @js.native
  sealed trait mediumblue
    extends StObject
       with NamedColor
  @scala.inline
  def mediumblue: mediumblue = "mediumblue".asInstanceOf[mediumblue]
  
  @js.native
  sealed trait mediumorchid
    extends StObject
       with NamedColor
  @scala.inline
  def mediumorchid: mediumorchid = "mediumorchid".asInstanceOf[mediumorchid]
  
  @js.native
  sealed trait mediumpurple
    extends StObject
       with NamedColor
  @scala.inline
  def mediumpurple: mediumpurple = "mediumpurple".asInstanceOf[mediumpurple]
  
  @js.native
  sealed trait mediumseagreen
    extends StObject
       with NamedColor
  @scala.inline
  def mediumseagreen: mediumseagreen = "mediumseagreen".asInstanceOf[mediumseagreen]
  
  @js.native
  sealed trait mediumslateblue
    extends StObject
       with NamedColor
  @scala.inline
  def mediumslateblue: mediumslateblue = "mediumslateblue".asInstanceOf[mediumslateblue]
  
  @js.native
  sealed trait mediumspringgreen
    extends StObject
       with NamedColor
  @scala.inline
  def mediumspringgreen: mediumspringgreen = "mediumspringgreen".asInstanceOf[mediumspringgreen]
  
  @js.native
  sealed trait mediumturquoise
    extends StObject
       with NamedColor
  @scala.inline
  def mediumturquoise: mediumturquoise = "mediumturquoise".asInstanceOf[mediumturquoise]
  
  @js.native
  sealed trait mediumvioletred
    extends StObject
       with NamedColor
  @scala.inline
  def mediumvioletred: mediumvioletred = "mediumvioletred".asInstanceOf[mediumvioletred]
  
  @js.native
  sealed trait menu_
    extends StObject
       with MozWindowShadow
       with _Font
  @scala.inline
  def menu_ : menu_ = "menu".asInstanceOf[menu_]
  
  @js.native
  sealed trait menuarrow
    extends StObject
       with MozAppearance
  @scala.inline
  def menuarrow: menuarrow = "menuarrow".asInstanceOf[menuarrow]
  
  @js.native
  sealed trait menubar
    extends StObject
       with MozAppearance
  @scala.inline
  def menubar: menubar = "menubar".asInstanceOf[menubar]
  
  @js.native
  sealed trait menucheckbox
    extends StObject
       with MozAppearance
  @scala.inline
  def menucheckbox: menucheckbox = "menucheckbox".asInstanceOf[menucheckbox]
  
  @js.native
  sealed trait menuimage
    extends StObject
       with MozAppearance
  @scala.inline
  def menuimage: menuimage = "menuimage".asInstanceOf[menuimage]
  
  @js.native
  sealed trait menuitem
    extends StObject
       with MozAppearance
  @scala.inline
  def menuitem: menuitem = "menuitem".asInstanceOf[menuitem]
  
  @js.native
  sealed trait menuitemtext
    extends StObject
       with MozAppearance
  @scala.inline
  def menuitemtext: menuitemtext = "menuitemtext".asInstanceOf[menuitemtext]
  
  @js.native
  sealed trait menulist
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def menulist: menulist = "menulist".asInstanceOf[menulist]
  
  @js.native
  sealed trait `menulist-button`
    extends StObject
       with Appearance
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def `menulist-button`: `menulist-button` = "menulist-button".asInstanceOf[`menulist-button`]
  
  @js.native
  sealed trait `menulist-text`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def `menulist-text`: `menulist-text` = "menulist-text".asInstanceOf[`menulist-text`]
  
  @js.native
  sealed trait `menulist-textfield`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def `menulist-textfield`: `menulist-textfield` = "menulist-textfield".asInstanceOf[`menulist-textfield`]
  
  @js.native
  sealed trait menupopup
    extends StObject
       with MozAppearance
  @scala.inline
  def menupopup: menupopup = "menupopup".asInstanceOf[menupopup]
  
  @js.native
  sealed trait menuradio
    extends StObject
       with MozAppearance
  @scala.inline
  def menuradio: menuradio = "menuradio".asInstanceOf[menuradio]
  
  @js.native
  sealed trait menuseparator
    extends StObject
       with MozAppearance
  @scala.inline
  def menuseparator: menuseparator = "menuseparator".asInstanceOf[menuseparator]
  
  @js.native
  sealed trait `message-box`
    extends StObject
       with _Font
  @scala.inline
  def `message-box`: `message-box` = "message-box".asInstanceOf[`message-box`]
  
  @js.native
  sealed trait meter
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def meter: meter = "meter".asInstanceOf[meter]
  
  @js.native
  sealed trait meterbar
    extends StObject
       with MozAppearance
  @scala.inline
  def meterbar: meterbar = "meterbar".asInstanceOf[meterbar]
  
  @js.native
  sealed trait meterchunk
    extends StObject
       with MozAppearance
  @scala.inline
  def meterchunk: meterchunk = "meterchunk".asInstanceOf[meterchunk]
  
  @js.native
  sealed trait middle
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
       with TextAnchor
       with _VerticalAlign[Any]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midnightblue
    extends StObject
       with NamedColor
  @scala.inline
  def midnightblue: midnightblue = "midnightblue".asInstanceOf[midnightblue]
  
  @js.native
  sealed trait `min-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _TrackBreadth[Any]
       with _Width[Any]
  @scala.inline
  def `min-content`: `min-content` = "min-content".asInstanceOf[`min-content`]
  
  @js.native
  sealed trait `min-intrinsic`
    extends StObject
       with _MinWidth[Any]
       with _Width[Any]
  @scala.inline
  def `min-intrinsic`: `min-intrinsic` = "min-intrinsic".asInstanceOf[`min-intrinsic`]
  
  @js.native
  sealed trait mintcream
    extends StObject
       with NamedColor
  @scala.inline
  def mintcream: mintcream = "mintcream".asInstanceOf[mintcream]
  
  @js.native
  sealed trait mistyrose
    extends StObject
       with NamedColor
  @scala.inline
  def mistyrose: mistyrose = "mistyrose".asInstanceOf[mistyrose]
  
  @js.native
  sealed trait miter
    extends StObject
       with StrokeLinejoin
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait mixed
    extends StObject
       with TextOrientation
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait moccasin
    extends StObject
       with NamedColor
  @scala.inline
  def moccasin: moccasin = "moccasin".asInstanceOf[moccasin]
  
  @js.native
  sealed trait monospace
    extends StObject
       with GenericFamily
  @scala.inline
  def monospace: monospace = "monospace".asInstanceOf[monospace]
  
  @js.native
  sealed trait move
    extends StObject
       with _Cursor
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait multiple
    extends StObject
       with BoxLines
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait multiply
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def multiply: multiply = "multiply".asInstanceOf[multiply]
  
  @js.native
  sealed trait `n-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `n-resize`: `n-resize` = "n-resize".asInstanceOf[`n-resize`]
  
  @js.native
  sealed trait navajowhite
    extends StObject
       with NamedColor
  @scala.inline
  def navajowhite: navajowhite = "navajowhite".asInstanceOf[navajowhite]
  
  @js.native
  sealed trait navy
    extends StObject
       with NamedColor
  @scala.inline
  def navy: navy = "navy".asInstanceOf[navy]
  
  @js.native
  sealed trait `ne-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `ne-resize`: `ne-resize` = "ne-resize".asInstanceOf[`ne-resize`]
  
  @js.native
  sealed trait `nesw-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `nesw-resize`: `nesw-resize` = "nesw-resize".asInstanceOf[`nesw-resize`]
  
  @js.native
  sealed trait never
    extends StObject
       with _FontSmooth[Any]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait `no-change`
    extends StObject
       with DominantBaseline
  @scala.inline
  def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  
  @js.native
  sealed trait `no-clip`
    extends StObject
       with _MaskClip
       with _MaskLayer[Any]
  @scala.inline
  def `no-clip`: `no-clip` = "no-clip".asInstanceOf[`no-clip`]
  
  @js.native
  sealed trait `no-close-quote`
    extends StObject
       with Quote
  @scala.inline
  def `no-close-quote`: `no-close-quote` = "no-close-quote".asInstanceOf[`no-close-quote`]
  
  @js.native
  sealed trait `no-common-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `no-common-ligatures`: `no-common-ligatures` = "no-common-ligatures".asInstanceOf[`no-common-ligatures`]
  
  @js.native
  sealed trait `no-contextual`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `no-contextual`: `no-contextual` = "no-contextual".asInstanceOf[`no-contextual`]
  
  @js.native
  sealed trait `no-discretionary-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `no-discretionary-ligatures`: `no-discretionary-ligatures` = "no-discretionary-ligatures".asInstanceOf[`no-discretionary-ligatures`]
  
  @js.native
  sealed trait `no-drag`
    extends StObject
       with MozWindowDragging
  @scala.inline
  def `no-drag`: `no-drag` = "no-drag".asInstanceOf[`no-drag`]
  
  @js.native
  sealed trait `no-drop`
    extends StObject
       with _Cursor
  @scala.inline
  def `no-drop`: `no-drop` = "no-drop".asInstanceOf[`no-drop`]
  
  @js.native
  sealed trait `no-historical-ligatures`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  @scala.inline
  def `no-historical-ligatures`: `no-historical-ligatures` = "no-historical-ligatures".asInstanceOf[`no-historical-ligatures`]
  
  @js.native
  sealed trait `no-limit`
    extends StObject
       with _MsHyphenateLimitLines
  @scala.inline
  def `no-limit`: `no-limit` = "no-limit".asInstanceOf[`no-limit`]
  
  @js.native
  sealed trait `no-open-quote`
    extends StObject
       with Quote
  @scala.inline
  def `no-open-quote`: `no-open-quote` = "no-open-quote".asInstanceOf[`no-open-quote`]
  
  @js.native
  sealed trait `no-repeat`
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _RepeatStyle
  @scala.inline
  def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait `non-scaling-stroke`
    extends StObject
       with VectorEffect
  @scala.inline
  def `non-scaling-stroke`: `non-scaling-stroke` = "non-scaling-stroke".asInstanceOf[`non-scaling-stroke`]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `com.olvind.mui`.csstype.mod.Property._Animation because Already inherited
  - `com.olvind.mui`.csstype.mod.DataType._SingleAnimation because Already inherited */ @js.native
  sealed trait none
    extends StObject
       with Appearance
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with Clear
       with ColumnSpan
       with Float
       with FontKerning
       with FontOpticalSizing
       with ForcedColorAdjust
       with Hyphens
       with LineStyle
       with MozAppearance
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozWindowShadow
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PointerEvents
       with Resize
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with SingleAnimationFillMode
       with TextDecorationSkipInk
       with TextJustify
       with TextTransform
       with UserSelect
       with VectorEffect
       with WebkitAppearance
       with WebkitTouchCallout
       with _AnimationName
       with _BackdropFilter
       with _BackgroundImage
       with _BorderImage
       with _BorderImageSource
       with _BoxShadow
       with _ClipPath
       with _Contain
       with _Content
       with _CounterIncrement
       with _CounterReset
       with _CounterSet
       with _Cursor
       with _Display
       with _Filter
       with _FinalBgLayer[Any]
       with _Flex[Any]
       with _FontSizeAdjust
       with _FontSynthesis
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
       with _Grid
       with _GridTemplate
       with _GridTemplateAreas
       with _GridTemplateColumns[Any]
       with _GridTemplateRows[Any]
       with _HangingPunctuation
       with _LineClamp
       with _ListStyle
       with _ListStyleImage
       with _ListStyleType
       with _Marker
       with _MarkerEnd
       with _MarkerMid
       with _MarkerStart
       with _Marks
       with _MaskBorder
       with _MaskBorderSource
       with _MaskImage
       with _MaskLayer[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxLines
       with _MaxWidth[Any]
       with _MozBinding
       with _MozBorderBottomColors
       with _MozBorderLeftColors
       with _MozBorderRightColors
       with _MozBorderTopColors
       with _MozContextProperties
       with _MsContentZoomSnap
       with _MsFlowFrom
       with _MsFlowInto
       with _MsGridColumns[Any]
       with _MsGridRows[Any]
       with _Offset[Any]
       with _OffsetPath
       with _OverscrollBehavior
       with _Paint
       with _Perspective[Any]
       with _Quotes
       with _Rotate
       with _Scale
       with _ScrollSnapAlign
       with _ScrollSnapCoordinate[Any]
       with _ScrollSnapPointsX
       with _ScrollSnapPointsY
       with _ScrollSnapType
       with _ShapeOutside
       with _SingleTransition[Any]
       with _StrokeDasharray[Any]
       with _TextCombineUpright
       with _TextDecoration[Any]
       with _TextDecorationLine
       with _TextDecorationSkip
       with _TextEmphasis
       with _TextEmphasisStyle
       with _TextShadow
       with _TextSizeAdjust
       with _TouchAction
       with _Transform
       with _TransitionProperty
       with _Translate[Any]
       with _WebkitLineClamp
       with _WebkitMask[Any]
       with _WebkitMaskImage
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait nonzero
    extends StObject
       with ClipRule
       with FillRule
  @scala.inline
  def nonzero: nonzero = "nonzero".asInstanceOf[nonzero]
  
  @js.native
  sealed trait normal
    extends StObject
       with BlendMode
       with BoxDirection
       with FontKerning
       with FontVariantCaps
       with FontVariantPosition
       with ImeMode
       with LineBreak
       with MathStyle
       with MixBlendMode
       with MozUserFocus
       with OverflowWrap
       with ScrollSnapStop
       with SingleAnimationDirection
       with UnicodeBidi
       with WhiteSpace
       with WordBreak
       with WordWrap
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _AlignTracks
       with _ColorScheme
       with _ColumnGap[Any]
       with _Content
       with _FontFeatureSettings
       with _FontLanguageOverride
       with _FontStretchAbsolute
       with _FontStyle
       with com.olvind.mui.csstype.mod.AtRule._FontStyle
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantAlternates
       with _FontVariantEastAsian
       with _FontVariantLigatures
       with _FontVariantNumeric
       with _FontVariationSettings
       with _FontWeightAbsolute
       with _Gap[Any]
       with _InitialLetter
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _LetterSpacing[Any]
       with _LineHeight[Any]
       with _PaintOrder
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _RowGap[Any]
       with _WordSpacing[Any]
       with _Zoom
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-allowed`
    extends StObject
       with _Cursor
  @scala.inline
  def `not-allowed`: `not-allowed` = "not-allowed".asInstanceOf[`not-allowed`]
  
  @js.native
  sealed trait nowrap
    extends StObject
       with FlexWrap
       with WhiteSpace
       with _FlexFlow
  @scala.inline
  def nowrap: nowrap = "nowrap".asInstanceOf[nowrap]
  
  @js.native
  sealed trait `ns-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `ns-resize`: `ns-resize` = "ns-resize".asInstanceOf[`ns-resize`]
  
  @js.native
  sealed trait numbers
    extends StObject
       with _SpeakAs
  @scala.inline
  def numbers: numbers = "numbers".asInstanceOf[numbers]
  
  @js.native
  sealed trait numeric
    extends StObject
       with _System
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait `nw-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `nw-resize`: `nw-resize` = "nw-resize".asInstanceOf[`nw-resize`]
  
  @js.native
  sealed trait `nwse-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `nwse-resize`: `nwse-resize` = "nwse-resize".asInstanceOf[`nwse-resize`]
  
  @js.native
  sealed trait objects
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def objects: objects = "objects".asInstanceOf[objects]
  
  @js.native
  sealed trait oblique
    extends StObject
       with _FontStyle
       with com.olvind.mui.csstype.mod.AtRule._FontStyle
  @scala.inline
  def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait oldlace
    extends StObject
       with NamedColor
  @scala.inline
  def oldlace: oldlace = "oldlace".asInstanceOf[oldlace]
  
  @js.native
  sealed trait `oldstyle-nums`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `oldstyle-nums`: `oldstyle-nums` = "oldstyle-nums".asInstanceOf[`oldstyle-nums`]
  
  @js.native
  sealed trait olive
    extends StObject
       with NamedColor
  @scala.inline
  def olive: olive = "olive".asInstanceOf[olive]
  
  @js.native
  sealed trait olivedrab
    extends StObject
       with NamedColor
  @scala.inline
  def olivedrab: olivedrab = "olivedrab".asInstanceOf[olivedrab]
  
  @js.native
  sealed trait open
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait `open-quote`
    extends StObject
       with Quote
  @scala.inline
  def `open-quote`: `open-quote` = "open-quote".asInstanceOf[`open-quote`]
  
  @js.native
  sealed trait optimizeLegibility
    extends StObject
       with TextRendering
  @scala.inline
  def optimizeLegibility: optimizeLegibility = "optimizeLegibility".asInstanceOf[optimizeLegibility]
  
  @js.native
  sealed trait optimizeQuality
    extends StObject
       with ColorRendering
  @scala.inline
  def optimizeQuality: optimizeQuality = "optimizeQuality".asInstanceOf[optimizeQuality]
  
  @js.native
  sealed trait optimizeSpeed
    extends StObject
       with ColorRendering
       with ShapeRendering
       with TextRendering
  @scala.inline
  def optimizeSpeed: optimizeSpeed = "optimizeSpeed".asInstanceOf[optimizeSpeed]
  
  @js.native
  sealed trait optional
    extends StObject
       with FontDisplay
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait orange
    extends StObject
       with NamedColor
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait orangered
    extends StObject
       with NamedColor
  @scala.inline
  def orangered: orangered = "orangered".asInstanceOf[orangered]
  
  @js.native
  sealed trait orchid
    extends StObject
       with NamedColor
  @scala.inline
  def orchid: orchid = "orchid".asInstanceOf[orchid]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait outset
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  @scala.inline
  def outset: outset = "outset".asInstanceOf[outset]
  
  @js.native
  sealed trait outside
    extends StObject
       with ListStylePosition
       with _ListStyle
  @scala.inline
  def outside: outside = "outside".asInstanceOf[outside]
  
  @js.native
  sealed trait over
    extends StObject
       with _RubyPosition
  @scala.inline
  def over: over = "over".asInstanceOf[over]
  
  @js.native
  sealed trait overlay
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait overline
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def overline: overline = "overline".asInstanceOf[overline]
  
  @js.native
  sealed trait padding
    extends StObject
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait `padding-box`
    extends StObject
       with Box
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
       with VisualBox
  @scala.inline
  def `padding-box`: `padding-box` = "padding-box".asInstanceOf[`padding-box`]
  
  @js.native
  sealed trait page
    extends StObject
       with BreakAfter
       with BreakBefore
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait paint
    extends StObject
       with _Contain
  @scala.inline
  def paint: paint = "paint".asInstanceOf[paint]
  
  @js.native
  sealed trait painted
    extends StObject
       with PointerEvents
  @scala.inline
  def painted: painted = "painted".asInstanceOf[painted]
  
  @js.native
  sealed trait palegoldenrod
    extends StObject
       with NamedColor
  @scala.inline
  def palegoldenrod: palegoldenrod = "palegoldenrod".asInstanceOf[palegoldenrod]
  
  @js.native
  sealed trait palegreen
    extends StObject
       with NamedColor
  @scala.inline
  def palegreen: palegreen = "palegreen".asInstanceOf[palegreen]
  
  @js.native
  sealed trait paleturquoise
    extends StObject
       with NamedColor
  @scala.inline
  def paleturquoise: paleturquoise = "paleturquoise".asInstanceOf[paleturquoise]
  
  @js.native
  sealed trait palevioletred
    extends StObject
       with NamedColor
  @scala.inline
  def palevioletred: palevioletred = "palevioletred".asInstanceOf[palevioletred]
  
  @js.native
  sealed trait `pan-down`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-down`: `pan-down` = "pan-down".asInstanceOf[`pan-down`]
  
  @js.native
  sealed trait `pan-left`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-left`: `pan-left` = "pan-left".asInstanceOf[`pan-left`]
  
  @js.native
  sealed trait `pan-right`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-right`: `pan-right` = "pan-right".asInstanceOf[`pan-right`]
  
  @js.native
  sealed trait `pan-up`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-up`: `pan-up` = "pan-up".asInstanceOf[`pan-up`]
  
  @js.native
  sealed trait `pan-x`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-x`: `pan-x` = "pan-x".asInstanceOf[`pan-x`]
  
  @js.native
  sealed trait `pan-y`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pan-y`: `pan-y` = "pan-y".asInstanceOf[`pan-y`]
  
  @js.native
  sealed trait papayawhip
    extends StObject
       with NamedColor
  @scala.inline
  def papayawhip: papayawhip = "papayawhip".asInstanceOf[papayawhip]
  
  @js.native
  sealed trait paused
    extends StObject
       with _AnimationPlayState
       with _SingleAnimation[Any]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait peachpuff
    extends StObject
       with NamedColor
  @scala.inline
  def peachpuff: peachpuff = "peachpuff".asInstanceOf[peachpuff]
  
  @js.native
  sealed trait peru
    extends StObject
       with NamedColor
  @scala.inline
  def peru: peru = "peru".asInstanceOf[peru]
  
  @js.native
  sealed trait `petite-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def `petite-caps`: `petite-caps` = "petite-caps".asInstanceOf[`petite-caps`]
  
  @js.native
  sealed trait `pinch-zoom`
    extends StObject
       with _TouchAction
  @scala.inline
  def `pinch-zoom`: `pinch-zoom` = "pinch-zoom".asInstanceOf[`pinch-zoom`]
  
  @js.native
  sealed trait pink
    extends StObject
       with NamedColor
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait pixelated
    extends StObject
       with ImageRendering
  @scala.inline
  def pixelated: pixelated = "pixelated".asInstanceOf[pixelated]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with UnicodeBidi
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait plum
    extends StObject
       with NamedColor
  @scala.inline
  def plum: plum = "plum".asInstanceOf[plum]
  
  @js.native
  sealed trait pointer
    extends StObject
       with _Cursor
  @scala.inline
  def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait portrait
    extends StObject
       with Orientation
       with _Size[Any]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait powderblue
    extends StObject
       with NamedColor
  @scala.inline
  def powderblue: powderblue = "powderblue".asInstanceOf[powderblue]
  
  @js.native
  sealed trait pre
    extends StObject
       with WhiteSpace
  @scala.inline
  def pre: pre = "pre".asInstanceOf[pre]
  
  @js.native
  sealed trait `pre-line`
    extends StObject
       with WhiteSpace
  @scala.inline
  def `pre-line`: `pre-line` = "pre-line".asInstanceOf[`pre-line`]
  
  @js.native
  sealed trait `pre-wrap`
    extends StObject
       with WhiteSpace
  @scala.inline
  def `pre-wrap`: `pre-wrap` = "pre-wrap".asInstanceOf[`pre-wrap`]
  
  @js.native
  sealed trait `preserve-3d`
    extends StObject
       with TransformStyle
  @scala.inline
  def `preserve-3d`: `preserve-3d` = "preserve-3d".asInstanceOf[`preserve-3d`]
  
  @js.native
  sealed trait progress
    extends StObject
       with _Cursor
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait `progress-bar`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def `progress-bar`: `progress-bar` = "progress-bar".asInstanceOf[`progress-bar`]
  
  @js.native
  sealed trait `progress-bar-value`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `progress-bar-value`: `progress-bar-value` = "progress-bar-value".asInstanceOf[`progress-bar-value`]
  
  @js.native
  sealed trait progressbar
    extends StObject
       with MozAppearance
  @scala.inline
  def progressbar: progressbar = "progressbar".asInstanceOf[progressbar]
  
  @js.native
  sealed trait `progressbar-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `progressbar-vertical`: `progressbar-vertical` = "progressbar-vertical".asInstanceOf[`progressbar-vertical`]
  
  @js.native
  sealed trait progresschunk
    extends StObject
       with MozAppearance
  @scala.inline
  def progresschunk: progresschunk = "progresschunk".asInstanceOf[progresschunk]
  
  @js.native
  sealed trait `progresschunk-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `progresschunk-vertical`: `progresschunk-vertical` = "progresschunk-vertical".asInstanceOf[`progresschunk-vertical`]
  
  @js.native
  sealed trait `proportional-nums`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `proportional-nums`: `proportional-nums` = "proportional-nums".asInstanceOf[`proportional-nums`]
  
  @js.native
  sealed trait `proportional-width`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  @scala.inline
  def `proportional-width`: `proportional-width` = "proportional-width".asInstanceOf[`proportional-width`]
  
  @js.native
  sealed trait proximity
    extends StObject
       with MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  @scala.inline
  def proximity: proximity = "proximity".asInstanceOf[proximity]
  
  @js.native
  sealed trait purple
    extends StObject
       with NamedColor
  @scala.inline
  def purple: purple = "purple".asInstanceOf[purple]
  
  @js.native
  sealed trait `push-button`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def `push-button`: `push-button` = "push-button".asInstanceOf[`push-button`]
  
  @js.native
  sealed trait radio
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait `radio-container`
    extends StObject
       with MozAppearance
  @scala.inline
  def `radio-container`: `radio-container` = "radio-container".asInstanceOf[`radio-container`]
  
  @js.native
  sealed trait `radio-label`
    extends StObject
       with MozAppearance
  @scala.inline
  def `radio-label`: `radio-label` = "radio-label".asInstanceOf[`radio-label`]
  
  @js.native
  sealed trait radiomenuitem
    extends StObject
       with MozAppearance
  @scala.inline
  def radiomenuitem: radiomenuitem = "radiomenuitem".asInstanceOf[radiomenuitem]
  
  @js.native
  sealed trait railed
    extends StObject
       with MsScrollRails
  @scala.inline
  def railed: railed = "railed".asInstanceOf[railed]
  
  @js.native
  sealed trait range
    extends StObject
       with MozAppearance
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait `range-thumb`
    extends StObject
       with MozAppearance
  @scala.inline
  def `range-thumb`: `range-thumb` = "range-thumb".asInstanceOf[`range-thumb`]
  
  @js.native
  sealed trait `read-only`
    extends StObject
       with MozUserModify
       with WebkitUserModify
  @scala.inline
  def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  
  @js.native
  sealed trait `read-write`
    extends StObject
       with MozUserModify
       with WebkitUserModify
  @scala.inline
  def `read-write`: `read-write` = "read-write".asInstanceOf[`read-write`]
  
  @js.native
  sealed trait `read-write-plaintext-only`
    extends StObject
       with WebkitUserModify
  @scala.inline
  def `read-write-plaintext-only`: `read-write-plaintext-only` = "read-write-plaintext-only".asInstanceOf[`read-write-plaintext-only`]
  
  @js.native
  sealed trait rebeccapurple
    extends StObject
       with NamedColor
  @scala.inline
  def rebeccapurple: rebeccapurple = "rebeccapurple".asInstanceOf[rebeccapurple]
  
  @js.native
  sealed trait recto
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  @scala.inline
  def recto: recto = "recto".asInstanceOf[recto]
  
  @js.native
  sealed trait red
    extends StObject
       with NamedColor
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait region
    extends StObject
       with BreakAfter
       with BreakBefore
  @scala.inline
  def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait relative
    extends StObject
       with Position
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait repeat
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x`
    extends StObject
       with _RepeatStyle
  @scala.inline
  def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y`
    extends StObject
       with _RepeatStyle
  @scala.inline
  def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait reset
    extends StObject
       with _Zoom
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait `reset-size`
    extends StObject
       with DominantBaseline
  @scala.inline
  def `reset-size`: `reset-size` = "reset-size".asInstanceOf[`reset-size`]
  
  @js.native
  sealed trait resizer
    extends StObject
       with MozAppearance
  @scala.inline
  def resizer: resizer = "resizer".asInstanceOf[resizer]
  
  @js.native
  sealed trait resizerpanel
    extends StObject
       with MozAppearance
  @scala.inline
  def resizerpanel: resizerpanel = "resizerpanel".asInstanceOf[resizerpanel]
  
  @js.native
  sealed trait reverse
    extends StObject
       with BoxDirection
       with SingleAnimationDirection
       with _OffsetRotate
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait revert
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  @scala.inline
  def revert: revert = "revert".asInstanceOf[revert]
  
  @js.native
  sealed trait ridge
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  @scala.inline
  def ridge: ridge = "ridge".asInstanceOf[ridge]
  
  @js.native
  sealed trait right
    extends StObject
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BgPosition[Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _Position[Any]
       with _TextUnderlinePosition
       with _TransformOrigin[Any]
       with _WebkitBoxReflect[Any]
       with _WebkitMaskPositionX[Any]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-side`
    extends StObject
       with _Azimuth
  @scala.inline
  def `right-side`: `right-side` = "right-side".asInstanceOf[`right-side`]
  
  @js.native
  sealed trait rightwards
    extends StObject
       with _Azimuth
  @scala.inline
  def rightwards: rightwards = "rightwards".asInstanceOf[rightwards]
  
  @js.native
  sealed trait rl
    extends StObject
       with MsBlockProgression
  @scala.inline
  def rl: rl = "rl".asInstanceOf[rl]
  
  @js.native
  sealed trait rosybrown
    extends StObject
       with NamedColor
  @scala.inline
  def rosybrown: rosybrown = "rosybrown".asInstanceOf[rosybrown]
  
  @js.native
  sealed trait round
    extends StObject
       with StrokeLinecap
       with StrokeLinejoin
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait row
    extends StObject
       with FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait `row-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `row-resize`: `row-resize` = "row-resize".asInstanceOf[`row-resize`]
  
  @js.native
  sealed trait `row-reverse`
    extends StObject
       with FlexDirection
       with _FlexFlow
  @scala.inline
  def `row-reverse`: `row-reverse` = "row-reverse".asInstanceOf[`row-reverse`]
  
  @js.native
  sealed trait royalblue
    extends StObject
       with NamedColor
  @scala.inline
  def royalblue: royalblue = "royalblue".asInstanceOf[royalblue]
  
  @js.native
  sealed trait rtl
    extends StObject
       with Direction
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait ruby
    extends StObject
       with DisplayInside
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  @scala.inline
  def ruby: ruby = "ruby".asInstanceOf[ruby]
  
  @js.native
  sealed trait `ruby-base`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `ruby-base`: `ruby-base` = "ruby-base".asInstanceOf[`ruby-base`]
  
  @js.native
  sealed trait `ruby-base-container`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `ruby-base-container`: `ruby-base-container` = "ruby-base-container".asInstanceOf[`ruby-base-container`]
  
  @js.native
  sealed trait `ruby-text`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `ruby-text`: `ruby-text` = "ruby-text".asInstanceOf[`ruby-text`]
  
  @js.native
  sealed trait `ruby-text-container`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `ruby-text-container`: `ruby-text-container` = "ruby-text-container".asInstanceOf[`ruby-text-container`]
  
  @js.native
  sealed trait `run-in`
    extends StObject
       with DisplayOutside
  @scala.inline
  def `run-in`: `run-in` = "run-in".asInstanceOf[`run-in`]
  
  @js.native
  sealed trait running
    extends StObject
       with _AnimationPlayState
       with _SingleAnimation[Any]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait `s-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `s-resize`: `s-resize` = "s-resize".asInstanceOf[`s-resize`]
  
  @js.native
  sealed trait sRGB
    extends StObject
       with ColorInterpolation
  @scala.inline
  def sRGB: sRGB = "sRGB".asInstanceOf[sRGB]
  
  @js.native
  sealed trait saddlebrown
    extends StObject
       with NamedColor
  @scala.inline
  def saddlebrown: saddlebrown = "saddlebrown".asInstanceOf[saddlebrown]
  
  @js.native
  sealed trait salmon
    extends StObject
       with NamedColor
  @scala.inline
  def salmon: salmon = "salmon".asInstanceOf[salmon]
  
  @js.native
  sealed trait sandybrown
    extends StObject
       with NamedColor
  @scala.inline
  def sandybrown: sandybrown = "sandybrown".asInstanceOf[sandybrown]
  
  @js.native
  sealed trait `sans-serif`
    extends StObject
       with GenericFamily
  @scala.inline
  def `sans-serif`: `sans-serif` = "sans-serif".asInstanceOf[`sans-serif`]
  
  @js.native
  sealed trait saturation
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def saturation: saturation = "saturation".asInstanceOf[saturation]
  
  @js.native
  sealed trait `scale-down`
    extends StObject
       with ObjectFit
  @scala.inline
  def `scale-down`: `scale-down` = "scale-down".asInstanceOf[`scale-down`]
  
  @js.native
  sealed trait `scale-horizontal`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scale-horizontal`: `scale-horizontal` = "scale-horizontal".asInstanceOf[`scale-horizontal`]
  
  @js.native
  sealed trait `scale-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scale-vertical`: `scale-vertical` = "scale-vertical".asInstanceOf[`scale-vertical`]
  
  @js.native
  sealed trait `scalethumb-horizontal`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scalethumb-horizontal`: `scalethumb-horizontal` = "scalethumb-horizontal".asInstanceOf[`scalethumb-horizontal`]
  
  @js.native
  sealed trait `scalethumb-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scalethumb-vertical`: `scalethumb-vertical` = "scalethumb-vertical".asInstanceOf[`scalethumb-vertical`]
  
  @js.native
  sealed trait scalethumbend
    extends StObject
       with MozAppearance
  @scala.inline
  def scalethumbend: scalethumbend = "scalethumbend".asInstanceOf[scalethumbend]
  
  @js.native
  sealed trait scalethumbstart
    extends StObject
       with MozAppearance
  @scala.inline
  def scalethumbstart: scalethumbstart = "scalethumbstart".asInstanceOf[scalethumbstart]
  
  @js.native
  sealed trait scalethumbtick
    extends StObject
       with MozAppearance
  @scala.inline
  def scalethumbtick: scalethumbtick = "scalethumbtick".asInstanceOf[scalethumbtick]
  
  @js.native
  sealed trait screen
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait scroll
    extends StObject
       with Attachment
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with _Overflow
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait `scroll-position`
    extends StObject
       with _AnimateableFeature
  @scala.inline
  def `scroll-position`: `scroll-position` = "scroll-position".asInstanceOf[`scroll-position`]
  
  @js.native
  sealed trait scrollbar_
    extends StObject
       with MsOverflowStyle
  @scala.inline
  def scrollbar_ : scrollbar_ = "scrollbar".asInstanceOf[scrollbar_]
  
  @js.native
  sealed trait `scrollbarbutton-down`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarbutton-down`: `scrollbarbutton-down` = "scrollbarbutton-down".asInstanceOf[`scrollbarbutton-down`]
  
  @js.native
  sealed trait `scrollbarbutton-left`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarbutton-left`: `scrollbarbutton-left` = "scrollbarbutton-left".asInstanceOf[`scrollbarbutton-left`]
  
  @js.native
  sealed trait `scrollbarbutton-right`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarbutton-right`: `scrollbarbutton-right` = "scrollbarbutton-right".asInstanceOf[`scrollbarbutton-right`]
  
  @js.native
  sealed trait `scrollbarbutton-up`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarbutton-up`: `scrollbarbutton-up` = "scrollbarbutton-up".asInstanceOf[`scrollbarbutton-up`]
  
  @js.native
  sealed trait `scrollbarthumb-horizontal`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarthumb-horizontal`: `scrollbarthumb-horizontal` = "scrollbarthumb-horizontal".asInstanceOf[`scrollbarthumb-horizontal`]
  
  @js.native
  sealed trait `scrollbarthumb-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbarthumb-vertical`: `scrollbarthumb-vertical` = "scrollbarthumb-vertical".asInstanceOf[`scrollbarthumb-vertical`]
  
  @js.native
  sealed trait `scrollbartrack-horizontal`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbartrack-horizontal`: `scrollbartrack-horizontal` = "scrollbartrack-horizontal".asInstanceOf[`scrollbartrack-horizontal`]
  
  @js.native
  sealed trait `scrollbartrack-vertical`
    extends StObject
       with MozAppearance
  @scala.inline
  def `scrollbartrack-vertical`: `scrollbartrack-vertical` = "scrollbartrack-vertical".asInstanceOf[`scrollbartrack-vertical`]
  
  @js.native
  sealed trait `se-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `se-resize`: `se-resize` = "se-resize".asInstanceOf[`se-resize`]
  
  @js.native
  sealed trait seagreen
    extends StObject
       with NamedColor
  @scala.inline
  def seagreen: seagreen = "seagreen".asInstanceOf[seagreen]
  
  @js.native
  sealed trait searchfield
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def searchfield: searchfield = "searchfield".asInstanceOf[searchfield]
  
  @js.native
  sealed trait `searchfield-cancel-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `searchfield-cancel-button`: `searchfield-cancel-button` = "searchfield-cancel-button".asInstanceOf[`searchfield-cancel-button`]
  
  @js.native
  sealed trait `searchfield-decoration`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `searchfield-decoration`: `searchfield-decoration` = "searchfield-decoration".asInstanceOf[`searchfield-decoration`]
  
  @js.native
  sealed trait `searchfield-results-button`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `searchfield-results-button`: `searchfield-results-button` = "searchfield-results-button".asInstanceOf[`searchfield-results-button`]
  
  @js.native
  sealed trait `searchfield-results-decoration`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `searchfield-results-decoration`: `searchfield-results-decoration` = "searchfield-results-decoration".asInstanceOf[`searchfield-results-decoration`]
  
  @js.native
  sealed trait seashell
    extends StObject
       with NamedColor
  @scala.inline
  def seashell: seashell = "seashell".asInstanceOf[seashell]
  
  @js.native
  sealed trait `select-after`
    extends StObject
       with MozUserFocus
  @scala.inline
  def `select-after`: `select-after` = "select-after".asInstanceOf[`select-after`]
  
  @js.native
  sealed trait `select-all`
    extends StObject
       with MozUserFocus
  @scala.inline
  def `select-all`: `select-all` = "select-all".asInstanceOf[`select-all`]
  
  @js.native
  sealed trait `select-before`
    extends StObject
       with MozUserFocus
  @scala.inline
  def `select-before`: `select-before` = "select-before".asInstanceOf[`select-before`]
  
  @js.native
  sealed trait `select-menu`
    extends StObject
       with MozUserFocus
  @scala.inline
  def `select-menu`: `select-menu` = "select-menu".asInstanceOf[`select-menu`]
  
  @js.native
  sealed trait `select-same`
    extends StObject
       with MozUserFocus
  @scala.inline
  def `select-same`: `select-same` = "select-same".asInstanceOf[`select-same`]
  
  @js.native
  sealed trait `self-end`
    extends StObject
       with SelfPosition
  @scala.inline
  def `self-end`: `self-end` = "self-end".asInstanceOf[`self-end`]
  
  @js.native
  sealed trait `self-start`
    extends StObject
       with SelfPosition
  @scala.inline
  def `self-start`: `self-start` = "self-start".asInstanceOf[`self-start`]
  
  @js.native
  sealed trait `semi-condensed`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `semi-condensed`: `semi-condensed` = "semi-condensed".asInstanceOf[`semi-condensed`]
  
  @js.native
  sealed trait `semi-expanded`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `semi-expanded`: `semi-expanded` = "semi-expanded".asInstanceOf[`semi-expanded`]
  
  @js.native
  sealed trait separate
    extends StObject
       with BorderCollapse
       with RubyMerge
  @scala.inline
  def separate: separate = "separate".asInstanceOf[separate]
  
  @js.native
  sealed trait separator
    extends StObject
       with MozAppearance
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait serif
    extends StObject
       with GenericFamily
  @scala.inline
  def serif: serif = "serif".asInstanceOf[serif]
  
  @js.native
  sealed trait sesame
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def sesame: sesame = "sesame".asInstanceOf[sesame]
  
  @js.native
  sealed trait sheet
    extends StObject
       with MozAppearance
       with MozWindowShadow
  @scala.inline
  def sheet: sheet = "sheet".asInstanceOf[sheet]
  
  @js.native
  sealed trait show
    extends StObject
       with EmptyCells
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait sideways
    extends StObject
       with TextOrientation
  @scala.inline
  def sideways: sideways = "sideways".asInstanceOf[sideways]
  
  @js.native
  sealed trait `sideways-lr`
    extends StObject
       with WritingMode
  @scala.inline
  def `sideways-lr`: `sideways-lr` = "sideways-lr".asInstanceOf[`sideways-lr`]
  
  @js.native
  sealed trait `sideways-rl`
    extends StObject
       with WritingMode
  @scala.inline
  def `sideways-rl`: `sideways-rl` = "sideways-rl".asInstanceOf[`sideways-rl`]
  
  @js.native
  sealed trait sienna
    extends StObject
       with NamedColor
  @scala.inline
  def sienna: sienna = "sienna".asInstanceOf[sienna]
  
  @js.native
  sealed trait silver
    extends StObject
       with NamedColor
  @scala.inline
  def silver: silver = "silver".asInstanceOf[silver]
  
  @js.native
  sealed trait simplified
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  
  @js.native
  sealed trait single
    extends StObject
       with BoxLines
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait size
    extends StObject
       with _Contain
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait skyblue
    extends StObject
       with NamedColor
  @scala.inline
  def skyblue: skyblue = "skyblue".asInstanceOf[skyblue]
  
  @js.native
  sealed trait `slashed-zero`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `slashed-zero`: `slashed-zero` = "slashed-zero".asInstanceOf[`slashed-zero`]
  
  @js.native
  sealed trait slateblue
    extends StObject
       with NamedColor
  @scala.inline
  def slateblue: slateblue = "slateblue".asInstanceOf[slateblue]
  
  @js.native
  sealed trait slategray
    extends StObject
       with NamedColor
  @scala.inline
  def slategray: slategray = "slategray".asInstanceOf[slategray]
  
  @js.native
  sealed trait slategrey
    extends StObject
       with NamedColor
  @scala.inline
  def slategrey: slategrey = "slategrey".asInstanceOf[slategrey]
  
  @js.native
  sealed trait slice
    extends StObject
       with BoxDecorationBreak
  @scala.inline
  def slice: slice = "slice".asInstanceOf[slice]
  
  @js.native
  sealed trait `slider-horizontal`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def `slider-horizontal`: `slider-horizontal` = "slider-horizontal".asInstanceOf[`slider-horizontal`]
  
  @js.native
  sealed trait `slider-vertical`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `slider-vertical`: `slider-vertical` = "slider-vertical".asInstanceOf[`slider-vertical`]
  
  @js.native
  sealed trait `sliderthumb-horizontal`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `sliderthumb-horizontal`: `sliderthumb-horizontal` = "sliderthumb-horizontal".asInstanceOf[`sliderthumb-horizontal`]
  
  @js.native
  sealed trait `sliderthumb-vertical`
    extends StObject
       with WebkitAppearance
  @scala.inline
  def `sliderthumb-vertical`: `sliderthumb-vertical` = "sliderthumb-vertical".asInstanceOf[`sliderthumb-vertical`]
  
  @js.native
  sealed trait small
    extends StObject
       with AbsoluteSize
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait `small-caps`
    extends StObject
       with FontVariantCaps
       with _FontSynthesis
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def `small-caps`: `small-caps` = "small-caps".asInstanceOf[`small-caps`]
  
  @js.native
  sealed trait `small-caption`
    extends StObject
       with _Font
  @scala.inline
  def `small-caption`: `small-caption` = "small-caption".asInstanceOf[`small-caption`]
  
  @js.native
  sealed trait smaller
    extends StObject
       with _FontSize[Any]
  @scala.inline
  def smaller: smaller = "smaller".asInstanceOf[smaller]
  
  @js.native
  sealed trait smooth
    extends StObject
       with ScrollBehavior
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait snow
    extends StObject
       with NamedColor
  @scala.inline
  def snow: snow = "snow".asInstanceOf[snow]
  
  @js.native
  sealed trait `soft-light`
    extends StObject
       with BlendMode
       with MixBlendMode
  @scala.inline
  def `soft-light`: `soft-light` = "soft-light".asInstanceOf[`soft-light`]
  
  @js.native
  sealed trait solid
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait `source-atop`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `source-atop`: `source-atop` = "source-atop".asInstanceOf[`source-atop`]
  
  @js.native
  sealed trait `source-in`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `source-in`: `source-in` = "source-in".asInstanceOf[`source-in`]
  
  @js.native
  sealed trait `source-out`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `source-out`: `source-out` = "source-out".asInstanceOf[`source-out`]
  
  @js.native
  sealed trait `source-over`
    extends StObject
       with CompositeStyle
  @scala.inline
  def `source-over`: `source-over` = "source-over".asInstanceOf[`source-over`]
  
  @js.native
  sealed trait space
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  
  @js.native
  sealed trait `space-around`
    extends StObject
       with ContentDistribution
       with RubyAlign
  @scala.inline
  def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  
  @js.native
  sealed trait `space-between`
    extends StObject
       with ContentDistribution
       with RubyAlign
  @scala.inline
  def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  
  @js.native
  sealed trait `space-evenly`
    extends StObject
       with ContentDistribution
  @scala.inline
  def `space-evenly`: `space-evenly` = "space-evenly".asInstanceOf[`space-evenly`]
  
  @js.native
  sealed trait spaces
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def spaces: spaces = "spaces".asInstanceOf[spaces]
  
  @js.native
  sealed trait `spell-out`
    extends StObject
       with _SpeakAs
  @scala.inline
  def `spell-out`: `spell-out` = "spell-out".asInstanceOf[`spell-out`]
  
  @js.native
  sealed trait `spelling-error`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def `spelling-error`: `spelling-error` = "spelling-error".asInstanceOf[`spelling-error`]
  
  @js.native
  sealed trait spinner
    extends StObject
       with MozAppearance
  @scala.inline
  def spinner: spinner = "spinner".asInstanceOf[spinner]
  
  @js.native
  sealed trait `spinner-downbutton`
    extends StObject
       with MozAppearance
  @scala.inline
  def `spinner-downbutton`: `spinner-downbutton` = "spinner-downbutton".asInstanceOf[`spinner-downbutton`]
  
  @js.native
  sealed trait `spinner-textfield`
    extends StObject
       with MozAppearance
  @scala.inline
  def `spinner-textfield`: `spinner-textfield` = "spinner-textfield".asInstanceOf[`spinner-textfield`]
  
  @js.native
  sealed trait `spinner-upbutton`
    extends StObject
       with MozAppearance
  @scala.inline
  def `spinner-upbutton`: `spinner-upbutton` = "spinner-upbutton".asInstanceOf[`spinner-upbutton`]
  
  @js.native
  sealed trait splitter
    extends StObject
       with MozAppearance
  @scala.inline
  def splitter: splitter = "splitter".asInstanceOf[splitter]
  
  @js.native
  sealed trait springgreen
    extends StObject
       with NamedColor
  @scala.inline
  def springgreen: springgreen = "springgreen".asInstanceOf[springgreen]
  
  @js.native
  sealed trait square
    extends StObject
       with StrokeLinecap
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait `square-button`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def `square-button`: `square-button` = "square-button".asInstanceOf[`square-button`]
  
  @js.native
  sealed trait stable
    extends StObject
       with _ScrollbarGutter
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait `stacked-fractions`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `stacked-fractions`: `stacked-fractions` = "stacked-fractions".asInstanceOf[`stacked-fractions`]
  
  @js.native
  sealed trait start
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with RubyAlign
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait static
    extends StObject
       with Position
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait `status-bar`
    extends StObject
       with _Font
  @scala.inline
  def `status-bar`: `status-bar` = "status-bar".asInstanceOf[`status-bar`]
  
  @js.native
  sealed trait statusbar
    extends StObject
       with MozAppearance
  @scala.inline
  def statusbar: statusbar = "statusbar".asInstanceOf[statusbar]
  
  @js.native
  sealed trait statusbarpanel
    extends StObject
       with MozAppearance
  @scala.inline
  def statusbarpanel: statusbarpanel = "statusbarpanel".asInstanceOf[statusbarpanel]
  
  @js.native
  sealed trait steelblue
    extends StObject
       with NamedColor
  @scala.inline
  def steelblue: steelblue = "steelblue".asInstanceOf[steelblue]
  
  @js.native
  sealed trait `step-end`
    extends StObject
       with _StepTimingFunction
  @scala.inline
  def `step-end`: `step-end` = "step-end".asInstanceOf[`step-end`]
  
  @js.native
  sealed trait `step-start`
    extends StObject
       with _StepTimingFunction
  @scala.inline
  def `step-start`: `step-start` = "step-start".asInstanceOf[`step-start`]
  
  @js.native
  sealed trait sticky
    extends StObject
       with Position
  @scala.inline
  def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait stretch
    extends StObject
       with BoxAlign
       with ContentDistribution
       with _AlignItems
       with _AlignSelf
       with _BorderImage
       with _BorderImageRepeat
       with _JustifyItems
       with _JustifySelf
       with _MaskBorder
       with _MaskBorderRepeat
       with _PlaceItems
       with _PlaceSelf
  @scala.inline
  def stretch: stretch = "stretch".asInstanceOf[stretch]
  
  @js.native
  sealed trait `stretch-to-fit`
    extends StObject
       with MozStackSizing
  @scala.inline
  def `stretch-to-fit`: `stretch-to-fit` = "stretch-to-fit".asInstanceOf[`stretch-to-fit`]
  
  @js.native
  sealed trait strict
    extends StObject
       with LineBreak
       with _Contain
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stroke
    extends StObject
       with PointerEvents
       with _MozContextProperties
       with _PaintOrder
  @scala.inline
  def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait `stroke-box`
    extends StObject
       with GeometryBox
       with TransformBox
  @scala.inline
  def `stroke-box`: `stroke-box` = "stroke-box".asInstanceOf[`stroke-box`]
  
  @js.native
  sealed trait `stroke-opacity`
    extends StObject
       with _MozContextProperties
  @scala.inline
  def `stroke-opacity`: `stroke-opacity` = "stroke-opacity".asInstanceOf[`stroke-opacity`]
  
  @js.native
  sealed trait style
    extends StObject
       with _Contain
       with _FontSynthesis
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait sub
    extends StObject
       with FontVariantPosition
       with _BaselineShift[Any]
       with _VerticalAlign[Any]
  @scala.inline
  def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait subgrid
    extends StObject
       with _GridTemplateColumns[Any]
       with _GridTemplateRows[Any]
  @scala.inline
  def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  
  @js.native
  sealed trait subtract
    extends StObject
       with CompositingOperator
  @scala.inline
  def subtract: subtract = "subtract".asInstanceOf[subtract]
  
  @js.native
  sealed trait `super`
    extends StObject
       with FontVariantPosition
       with _BaselineShift[Any]
       with _VerticalAlign[Any]
  @scala.inline
  def `super`: `super` = "super".asInstanceOf[`super`]
  
  @js.native
  sealed trait `sw-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `sw-resize`: `sw-resize` = "sw-resize".asInstanceOf[`sw-resize`]
  
  @js.native
  sealed trait swap
    extends StObject
       with FontDisplay
  @scala.inline
  def swap: swap = "swap".asInstanceOf[swap]
  
  @js.native
  sealed trait symbolic
    extends StObject
       with _System
  @scala.inline
  def symbolic: symbolic = "symbolic".asInstanceOf[symbolic]
  
  @js.native
  sealed trait tab
    extends StObject
       with MozAppearance
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait `tab-scroll-arrow-back`
    extends StObject
       with MozAppearance
  @scala.inline
  def `tab-scroll-arrow-back`: `tab-scroll-arrow-back` = "tab-scroll-arrow-back".asInstanceOf[`tab-scroll-arrow-back`]
  
  @js.native
  sealed trait `tab-scroll-arrow-forward`
    extends StObject
       with MozAppearance
  @scala.inline
  def `tab-scroll-arrow-forward`: `tab-scroll-arrow-forward` = "tab-scroll-arrow-forward".asInstanceOf[`tab-scroll-arrow-forward`]
  
  @js.native
  sealed trait table
    extends StObject
       with DisplayInside
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait `table-caption`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-caption`: `table-caption` = "table-caption".asInstanceOf[`table-caption`]
  
  @js.native
  sealed trait `table-cell`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-cell`: `table-cell` = "table-cell".asInstanceOf[`table-cell`]
  
  @js.native
  sealed trait `table-column`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-column`: `table-column` = "table-column".asInstanceOf[`table-column`]
  
  @js.native
  sealed trait `table-column-group`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-column-group`: `table-column-group` = "table-column-group".asInstanceOf[`table-column-group`]
  
  @js.native
  sealed trait `table-footer-group`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-footer-group`: `table-footer-group` = "table-footer-group".asInstanceOf[`table-footer-group`]
  
  @js.native
  sealed trait `table-header-group`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-header-group`: `table-header-group` = "table-header-group".asInstanceOf[`table-header-group`]
  
  @js.native
  sealed trait `table-row`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-row`: `table-row` = "table-row".asInstanceOf[`table-row`]
  
  @js.native
  sealed trait `table-row-group`
    extends StObject
       with DisplayInternal
  @scala.inline
  def `table-row-group`: `table-row-group` = "table-row-group".asInstanceOf[`table-row-group`]
  
  @js.native
  sealed trait tabpanel
    extends StObject
       with MozAppearance
  @scala.inline
  def tabpanel: tabpanel = "tabpanel".asInstanceOf[tabpanel]
  
  @js.native
  sealed trait tabpanels
    extends StObject
       with MozAppearance
  @scala.inline
  def tabpanels: tabpanels = "tabpanels".asInstanceOf[tabpanels]
  
  @js.native
  sealed trait `tabular-nums`
    extends StObject
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  @scala.inline
  def `tabular-nums`: `tabular-nums` = "tabular-nums".asInstanceOf[`tabular-nums`]
  
  @js.native
  sealed trait tan
    extends StObject
       with NamedColor
  @scala.inline
  def tan: tan = "tan".asInstanceOf[tan]
  
  @js.native
  sealed trait tb
    extends StObject
       with MsBlockProgression
  @scala.inline
  def tb: tb = "tb".asInstanceOf[tb]
  
  @js.native
  sealed trait teal
    extends StObject
       with NamedColor
  @scala.inline
  def teal: teal = "teal".asInstanceOf[teal]
  
  @js.native
  sealed trait text
    extends StObject
       with MsUserSelect
       with UserSelect
       with _Cursor
       with _WebkitMask[Any]
       with _WebkitMaskClip
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text-after-edge`
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def `text-after-edge`: `text-after-edge` = "text-after-edge".asInstanceOf[`text-after-edge`]
  
  @js.native
  sealed trait `text-before-edge`
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  @scala.inline
  def `text-before-edge`: `text-before-edge` = "text-before-edge".asInstanceOf[`text-before-edge`]
  
  @js.native
  sealed trait `text-bottom`
    extends StObject
       with _VerticalAlign[Any]
  @scala.inline
  def `text-bottom`: `text-bottom` = "text-bottom".asInstanceOf[`text-bottom`]
  
  @js.native
  sealed trait `text-top`
    extends StObject
       with _VerticalAlign[Any]
  @scala.inline
  def `text-top`: `text-top` = "text-top".asInstanceOf[`text-top`]
  
  @js.native
  sealed trait textarea
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait textfield
    extends StObject
       with Appearance
       with MozAppearance
       with WebkitAppearance
  @scala.inline
  def textfield: textfield = "textfield".asInstanceOf[textfield]
  
  @js.native
  sealed trait `textfield-multiline`
    extends StObject
       with MozAppearance
  @scala.inline
  def `textfield-multiline`: `textfield-multiline` = "textfield-multiline".asInstanceOf[`textfield-multiline`]
  
  @js.native
  sealed trait thick
    extends StObject
       with _LineWidth[Any]
  @scala.inline
  def thick: thick = "thick".asInstanceOf[thick]
  
  @js.native
  sealed trait thin
    extends StObject
       with ScrollbarWidth
       with _LineWidth[Any]
  @scala.inline
  def thin: thin = "thin".asInstanceOf[thin]
  
  @js.native
  sealed trait thistle
    extends StObject
       with NamedColor
  @scala.inline
  def thistle: thistle = "thistle".asInstanceOf[thistle]
  
  @js.native
  sealed trait `titling-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def `titling-caps`: `titling-caps` = "titling-caps".asInstanceOf[`titling-caps`]
  
  @js.native
  sealed trait tomato
    extends StObject
       with NamedColor
  @scala.inline
  def tomato: tomato = "tomato".asInstanceOf[tomato]
  
  @js.native
  sealed trait toolbar
    extends StObject
       with MozAppearance
  @scala.inline
  def toolbar: toolbar = "toolbar".asInstanceOf[toolbar]
  
  @js.native
  sealed trait toolbarbutton
    extends StObject
       with MozAppearance
  @scala.inline
  def toolbarbutton: toolbarbutton = "toolbarbutton".asInstanceOf[toolbarbutton]
  
  @js.native
  sealed trait `toolbarbutton-dropdown`
    extends StObject
       with MozAppearance
  @scala.inline
  def `toolbarbutton-dropdown`: `toolbarbutton-dropdown` = "toolbarbutton-dropdown".asInstanceOf[`toolbarbutton-dropdown`]
  
  @js.native
  sealed trait toolbargripper
    extends StObject
       with MozAppearance
  @scala.inline
  def toolbargripper: toolbargripper = "toolbargripper".asInstanceOf[toolbargripper]
  
  @js.native
  sealed trait toolbox
    extends StObject
       with MozAppearance
  @scala.inline
  def toolbox: toolbox = "toolbox".asInstanceOf[toolbox]
  
  @js.native
  sealed trait tooltip
    extends StObject
       with MozAppearance
       with MozWindowShadow
  @scala.inline
  def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  
  @js.native
  sealed trait top
    extends StObject
       with CaptionSide
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _TransformOrigin[Any]
       with _VerticalAlign[Any]
       with _WebkitMaskPositionY[Any]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait touch
    extends StObject
       with WebkitOverflowScrolling
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait traditional
    extends StObject
       with EastAsianVariantValues
  @scala.inline
  def traditional: traditional = "traditional".asInstanceOf[traditional]
  
  @js.native
  sealed trait `trailing-spaces`
    extends StObject
       with _TextDecorationSkip
  @scala.inline
  def `trailing-spaces`: `trailing-spaces` = "trailing-spaces".asInstanceOf[`trailing-spaces`]
  
  @js.native
  sealed trait transparent
    extends StObject
       with NamedColor
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait treeheader
    extends StObject
       with MozAppearance
  @scala.inline
  def treeheader: treeheader = "treeheader".asInstanceOf[treeheader]
  
  @js.native
  sealed trait treeheadercell
    extends StObject
       with MozAppearance
  @scala.inline
  def treeheadercell: treeheadercell = "treeheadercell".asInstanceOf[treeheadercell]
  
  @js.native
  sealed trait treeheadersortarrow
    extends StObject
       with MozAppearance
  @scala.inline
  def treeheadersortarrow: treeheadersortarrow = "treeheadersortarrow".asInstanceOf[treeheadersortarrow]
  
  @js.native
  sealed trait treeitem
    extends StObject
       with MozAppearance
  @scala.inline
  def treeitem: treeitem = "treeitem".asInstanceOf[treeitem]
  
  @js.native
  sealed trait treeline
    extends StObject
       with MozAppearance
  @scala.inline
  def treeline: treeline = "treeline".asInstanceOf[treeline]
  
  @js.native
  sealed trait treetwisty
    extends StObject
       with MozAppearance
  @scala.inline
  def treetwisty: treetwisty = "treetwisty".asInstanceOf[treetwisty]
  
  @js.native
  sealed trait treetwistyopen
    extends StObject
       with MozAppearance
  @scala.inline
  def treetwistyopen: treetwistyopen = "treetwistyopen".asInstanceOf[treetwistyopen]
  
  @js.native
  sealed trait treeview
    extends StObject
       with MozAppearance
  @scala.inline
  def treeview: treeview = "treeview".asInstanceOf[treeview]
  
  @js.native
  sealed trait triangle
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  @scala.inline
  def triangle: triangle = "triangle".asInstanceOf[triangle]
  
  @js.native
  sealed trait `true`
    extends StObject
       with Inherits
       with MsAccelerator
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait turquoise
    extends StObject
       with NamedColor
  @scala.inline
  def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  
  @js.native
  sealed trait `ultra-condensed`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `ultra-condensed`: `ultra-condensed` = "ultra-condensed".asInstanceOf[`ultra-condensed`]
  
  @js.native
  sealed trait `ultra-expanded`
    extends StObject
       with _FontStretchAbsolute
  @scala.inline
  def `ultra-expanded`: `ultra-expanded` = "ultra-expanded".asInstanceOf[`ultra-expanded`]
  
  @js.native
  sealed trait under
    extends StObject
       with _RubyPosition
       with _TextUnderlinePosition
  @scala.inline
  def under: under = "under".asInstanceOf[under]
  
  @js.native
  sealed trait underline
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  
  @js.native
  sealed trait unicase
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with com.olvind.mui.csstype.mod.AtRule._FontVariant
  @scala.inline
  def unicase: unicase = "unicase".asInstanceOf[unicase]
  
  @js.native
  sealed trait unset
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  @scala.inline
  def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait uppercase
    extends StObject
       with TextTransform
  @scala.inline
  def uppercase: uppercase = "uppercase".asInstanceOf[uppercase]
  
  @js.native
  sealed trait upright
    extends StObject
       with TextOrientation
  @scala.inline
  def upright: upright = "upright".asInstanceOf[upright]
  
  @js.native
  sealed trait `use-script`
    extends StObject
       with DominantBaseline
  @scala.inline
  def `use-script`: `use-script` = "use-script".asInstanceOf[`use-script`]
  
  @js.native
  sealed trait verso
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  @scala.inline
  def verso: verso = "verso".asInstanceOf[verso]
  
  @js.native
  sealed trait vertical
    extends StObject
       with BoxOrient
       with MozOrient
       with Resize
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `vertical-lr`
    extends StObject
       with WritingMode
  @scala.inline
  def `vertical-lr`: `vertical-lr` = "vertical-lr".asInstanceOf[`vertical-lr`]
  
  @js.native
  sealed trait `vertical-rl`
    extends StObject
       with WritingMode
  @scala.inline
  def `vertical-rl`: `vertical-rl` = "vertical-rl".asInstanceOf[`vertical-rl`]
  
  @js.native
  sealed trait `vertical-text`
    extends StObject
       with _Cursor
  @scala.inline
  def `vertical-text`: `vertical-text` = "vertical-text".asInstanceOf[`vertical-text`]
  
  @js.native
  sealed trait `vertical-to-horizontal`
    extends StObject
       with MsScrollTranslation
  @scala.inline
  def `vertical-to-horizontal`: `vertical-to-horizontal` = "vertical-to-horizontal".asInstanceOf[`vertical-to-horizontal`]
  
  @js.native
  sealed trait `view-box`
    extends StObject
       with GeometryBox
       with TransformBox
  @scala.inline
  def `view-box`: `view-box` = "view-box".asInstanceOf[`view-box`]
  
  @js.native
  sealed trait violet
    extends StObject
       with NamedColor
  @scala.inline
  def violet: violet = "violet".asInstanceOf[violet]
  
  @js.native
  sealed trait visible
    extends StObject
       with BackfaceVisibility
       with ContentVisibility
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with PointerEvents
       with Visibility
       with _Overflow
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait visibleFill
    extends StObject
       with PointerEvents
  @scala.inline
  def visibleFill: visibleFill = "visibleFill".asInstanceOf[visibleFill]
  
  @js.native
  sealed trait visiblePainted
    extends StObject
       with PointerEvents
  @scala.inline
  def visiblePainted: visiblePainted = "visiblePainted".asInstanceOf[visiblePainted]
  
  @js.native
  sealed trait visibleStroke
    extends StObject
       with PointerEvents
  @scala.inline
  def visibleStroke: visibleStroke = "visibleStroke".asInstanceOf[visibleStroke]
  
  @js.native
  sealed trait `w-resize`
    extends StObject
       with _Cursor
  @scala.inline
  def `w-resize`: `w-resize` = "w-resize".asInstanceOf[`w-resize`]
  
  @js.native
  sealed trait wait
    extends StObject
       with _Cursor
  
  @js.native
  sealed trait wavy
    extends StObject
       with TextDecorationStyle
       with _TextDecoration[Any]
  @scala.inline
  def wavy: wavy = "wavy".asInstanceOf[wavy]
  
  @js.native
  sealed trait weight
    extends StObject
       with _FontSynthesis
  @scala.inline
  def weight: weight = "weight".asInstanceOf[weight]
  
  @js.native
  sealed trait wheat
    extends StObject
       with NamedColor
  @scala.inline
  def wheat: wheat = "wheat".asInstanceOf[wheat]
  
  @js.native
  sealed trait white
    extends StObject
       with NamedColor
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait whitesmoke
    extends StObject
       with NamedColor
  @scala.inline
  def whitesmoke: whitesmoke = "whitesmoke".asInstanceOf[whitesmoke]
  
  @js.native
  sealed trait words
    extends StObject
       with _SpeakAs
  @scala.inline
  def words: words = "words".asInstanceOf[words]
  
  @js.native
  sealed trait wrap
    extends StObject
       with FlexWrap
       with MsWrapThrough
       with _FlexFlow
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  
  @js.native
  sealed trait `wrap-reverse`
    extends StObject
       with FlexWrap
       with _FlexFlow
  @scala.inline
  def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
  
  @js.native
  sealed trait `write-only`
    extends StObject
       with MozUserModify
  @scala.inline
  def `write-only`: `write-only` = "write-only".asInstanceOf[`write-only`]
  
  @js.native
  sealed trait x
    extends StObject
       with _ScrollSnapType
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait `x-end`
    extends StObject
       with _BackgroundPositionX[Any]
  @scala.inline
  def `x-end`: `x-end` = "x-end".asInstanceOf[`x-end`]
  
  @js.native
  sealed trait `x-large`
    extends StObject
       with AbsoluteSize
  @scala.inline
  def `x-large`: `x-large` = "x-large".asInstanceOf[`x-large`]
  
  @js.native
  sealed trait `x-small`
    extends StObject
       with AbsoluteSize
  @scala.inline
  def `x-small`: `x-small` = "x-small".asInstanceOf[`x-small`]
  
  @js.native
  sealed trait `x-start`
    extends StObject
       with _BackgroundPositionX[Any]
  @scala.inline
  def `x-start`: `x-start` = "x-start".asInstanceOf[`x-start`]
  
  @js.native
  sealed trait xor
    extends StObject
       with CompositeStyle
  @scala.inline
  def xor: xor = "xor".asInstanceOf[xor]
  
  @js.native
  sealed trait `xx-large`
    extends StObject
       with AbsoluteSize
  @scala.inline
  def `xx-large`: `xx-large` = "xx-large".asInstanceOf[`xx-large`]
  
  @js.native
  sealed trait `xx-small`
    extends StObject
       with AbsoluteSize
  @scala.inline
  def `xx-small`: `xx-small` = "xx-small".asInstanceOf[`xx-small`]
  
  @js.native
  sealed trait `xxx-large`
    extends StObject
       with AbsoluteSize
  @scala.inline
  def `xxx-large`: `xxx-large` = "xxx-large".asInstanceOf[`xxx-large`]
  
  @js.native
  sealed trait y
    extends StObject
       with _ScrollSnapType
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait `y-end`
    extends StObject
       with _BackgroundPositionY[Any]
  @scala.inline
  def `y-end`: `y-end` = "y-end".asInstanceOf[`y-end`]
  
  @js.native
  sealed trait `y-start`
    extends StObject
       with _BackgroundPositionY[Any]
  @scala.inline
  def `y-start`: `y-start` = "y-start".asInstanceOf[`y-start`]
  
  @js.native
  sealed trait yellow
    extends StObject
       with NamedColor
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait yellowgreen
    extends StObject
       with NamedColor
  @scala.inline
  def yellowgreen: yellowgreen = "yellowgreen".asInstanceOf[yellowgreen]
  
  @js.native
  sealed trait zoom
    extends StObject
       with MsContentZooming
       with UserZoom
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
  
  @js.native
  sealed trait `zoom-in`
    extends StObject
       with _Cursor
  @scala.inline
  def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  
  @js.native
  sealed trait `zoom-out`
    extends StObject
       with _Cursor
  @scala.inline
  def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
}
